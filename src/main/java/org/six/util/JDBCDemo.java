package org.six.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * Created by yanglu on 5/7/17.
 */
public class JDBCDemo {
        static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        static final String DB_URL = "jdbc:mysql://sql12.freemysqlhosting.net:3306/sql12173107";

        //  Database credentials
        static final String USER = "sql12173107";
        static final String PASS = "VundJa6yE9";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try{
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT * FROM flight_price";
//            sql = "INSERT INTO flight_table(id,flight_number,minprice) VALUES(4,'123456',333)";
//            sql.executeUpdate("INSERT INTO Sessions(id_user) VALUES(1)"); // DML operation
//            sql.executeQuery("SELECT LAST_INSERT_ID()"); // SELECT operation
            int rs1 = stmt.executeUpdate("INSERT INTO flight_price(id,flight_number,minprice) VALUES(5,'123456',333)");
            ResultSet rs = stmt.executeQuery(sql);




            //STEP 5: Extract data from result set
            while(rs.next()){
                //Retrieve by column name
                int id  = rs.getInt("id");
                String flightNumber = rs.getString("flight_number");
                String minPrice = rs.getString("minprice");

                //Display values
                System.out.print("id: " + id);
                System.out.print(", FlightNumber: " + flightNumber);
                System.out.print(", MinPrice: " + minPrice);
            }
            //STEP 6: Clean-up environment
            rs.close();
            stmt.close();
            conn.close();
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally{
            //finally block used to close resources
            try{
                if(stmt!=null)
                    stmt.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");
    }//end main


//        Class.forName("com.mysql.jdbc.Driver");
//        String url = "jdbc:mysql://sql12.freemysqlhosting.net:3306/sql12173107";
//        Properties props = new Properties();
//        FileInputStream propertiesFile = new FileInputStream("JDBC.properties");
//        props.load(propertiesFile);
//        propertiesFile.close();
//
//        String DriverStr = props.getProperty("jdbc.Driver");
//        String urlStr = props.getProperty("jdbc.url");
//        String userName = props.getProperty("jdbc.name");
//        String passcode = props.getProperty("jdbc.passworld");
//
//        //打开数据库链接
//        Connection connection = DriverManager.getConnection(urlStr,userName,passcode);
//        //执行SQL
//        Statement sta = connection.createStatement();
//        //executeUpdate可以返回数据库更新的行数
//        int efactRow = sta.executeUpdate("UPDATE USER SET Permition = 'admin' WHERE username = 'Zing'");
//        //executeQuery可以返回一个查询的结果集，这个集合的迭代器略有不同Iterator,没有hasNext方法，初始是，指针在数据前，必须调用next方法才能读取第一行数据
//        ResultSet resultSet = sta.executeQuery("SELECT * FROM USER ;");
//        while (resultSet.next()){
//            //当前行获取第一栏的值，具体类型需要看数据库实现
//            resultSet.getString(1);
//        }
//        //关闭语句
//        sta.close();
//        //关闭结果集
//        resultSet.close();
//        //关闭数据库连接
//        connection.close();
//

    }