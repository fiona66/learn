package org.six.util;

import java.io.IOException;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by yanglu on 5/7/17.
 */
public class JDBCDemo {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
//   static final String DB_URL = "jdbc:mysql://sql12.freemysqlhosting.net:3306/sql12173107";
    static final String DB_URL="jdbc:mysql://127.0.0.1:3306/flight_min_price";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "FIONAYL0510";
//    Date date=new Date();
//    SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
//
//    FlightDemo flight=new FlightDemo();
//    int minprice=flight.getMinPrice();
//    Object getFlightNumber = flight.getFlightNumber();
//    String getDapatureDate = flight.getDepartureTime();


    public List<FlightEveryDayMinPrice> query(String sql) throws IOException, ParseException {
        Connection conn = null;
        Statement stmt = null;
        List<FlightEveryDayMinPrice> retList = new ArrayList<>();

        try{
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);


            System.out.println("Creating statement...");
            stmt = conn.createStatement();

            //STEP 4: Execute a query
            ResultSet rs = stmt.executeQuery(sql);  // 必须是查询语句.
            //STEP 5: Extract data from result set
            while(rs.next()){
                //Retrieve by column name
                FlightEveryDayMinPrice flightEveryDayMinPrice = new FlightEveryDayMinPrice();
                int id  = rs.getInt("id");
                String flightNumber = rs.getString("flight_num");
                String minPrice = rs.getString("minprice");
                String querytime = rs.getString("querytime");
                String departureaDate = rs.getString("departure_date");



                flightEveryDayMinPrice.setId(id);
                flightEveryDayMinPrice.setFlightNumber(flightNumber);
                flightEveryDayMinPrice.setMinPrice(minPrice);
                flightEveryDayMinPrice.setQuerytime(querytime);
                flightEveryDayMinPrice.setDepartureaDate(departureaDate);

                retList.add(flightEveryDayMinPrice);
                System.out.println(flightEveryDayMinPrice);
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



    public int insert(String sql) throws IOException, ParseException {
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

            //STEP 4: Execute a query
            ret = stmt.executeUpdate(sql);  // 必须是查询语句.
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