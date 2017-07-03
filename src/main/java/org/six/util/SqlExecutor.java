package org.six.util;

import java.io.IOException;
import java.sql.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yanglu on 5/7/17.
 */
public class SqlExecutor {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL="jdbc:mysql://127.0.0.1:3306/flight_min_price?useUnicode=true&characterEncoding=UTF-8";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "FIONAYL0510";

    public  List<StudentInformation> query(String sql) throws IOException, ParseException {
        Connection conn = null;
        Statement stmt = null;
        List<StudentInformation> retList = new ArrayList<>();

        try{
            //STEP retList2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);


            System.out.println("Creating statement...");
            stmt = conn.createStatement();

            //STEP 4: Execute a query
//            sql = "select * from student_system; ";
            ResultSet rs = stmt.executeQuery(sql);  // 必须是查询语句.
            //STEP 5: Extract data from result set
            while(rs.next()){
                //Retrieve by column name
                SchQuery schQuery = new SchQuery();
                int id = rs.getInt("id");
                int sid = rs.getInt("sid");
                String name = rs.getString("name");
                String gender = rs.getString("gender");
                String subject = rs.getString("subject");
                String grade = rs.getString("grade");
                String birth = rs.getString("birth");

                StudentInformation studentInformation = new StudentInformation();
                studentInformation.setId(id);
                studentInformation.setSid(sid);
                studentInformation.setName(name);
                studentInformation.setGender(gender);
                studentInformation.setSubject(subject);
                studentInformation.setGrade(grade);
                studentInformation.setBirth(birth);

                retList.add(studentInformation);
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
        return retList;
    }//end main



    public int executeUpdate(String sql) throws IOException, ParseException {
        Connection conn = null;
        Statement stmt = null;
        int ret = 0;

        try {
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");


            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);


            System.out.println("Creating statement...");
            stmt = conn.createStatement();


            //STEP 4: Execute a updatesql
            ret = stmt.executeUpdate(sql);
            //STEP 5: Extract data from result set


            //STEP 6: Clean-up environment
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
        }//end

        System.out.println("Goodbye!");
        return ret;
    }//end main

}