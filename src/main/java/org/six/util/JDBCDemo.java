package org.six.util;

import java.io.IOException;
//import java.sql.*;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by yanglu on 5/7/17.
 */
public class JDBCDemo {
        static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
//        static final String DB_URL = "jdbc:mysql://sql12.freemysqlhosting.net:3306/sql12173107";
        static final String DB_URL="jdbc:mysql://127.0.0.1:3306/flight_min_price";

    //  Database credentials
        static final String USER = "root";
        static final String PASS = "FIONAYL0510";


    public void addToMySQL() throws IOException, ParseException {
        Connection conn = null;
        Statement stmt = null;
        Date date=new Date();
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
//        date currentdate=date.getTime();
        FlightDemo getminprice=new FlightDemo();
        int minprice=getminprice.getMinPrice();
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
            sql = "SELECT * FROM flightminprice";
            String demo = String.valueOf(Math.random()).substring(2,5);
            System.out.println(demo);
            String sql2="INSERT INTO flightminprice(flight_num,minprice,querytime) VALUES ('"+ demo +"' ,'"+ minprice +"','"+ ft.format(date)+"')";

//            String sql2="INSERT INTO flightminprice(flight_num,minprice,querytime) VALUES"+"('Demo' " + ",123"+",'+date.toString()')";
//            int rs1 = stmt.executeUpdate("INSERT INTO flightminprice(flight_num,minprice,querytime) VALUES('Demo',123456,'2017-06-05 18:48:40')");
            int rs1 = stmt.executeUpdate(sql2);
            ResultSet rs = stmt.executeQuery(sql);

            //STEP 5: Extract data from result set
            while(rs.next()){
                //Retrieve by column name
                int id  = rs.getInt("id");
                String flightNumber = rs.getString("flight_num");
                String minPrice = rs.getString("minprice");
                String querytime = rs.getString("querytime");

                //Display values
                System.out.print("id: " + id);
                System.out.print(", FlightNumber: " + flightNumber);
                System.out.print(", MinPrice: " + minPrice);
                System.out.print(", Querytime: " + querytime);

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

}