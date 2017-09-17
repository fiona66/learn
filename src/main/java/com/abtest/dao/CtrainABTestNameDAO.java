package com.abtest.dao;
import com.abtest.domain.CtrainABTestName;
import java.io.IOException;
import java.sql.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yanglu on 9/17/17.
 */
public class CtrainABTestNameDAO {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL="jdbc:mysql://127.0.0.1:3306/abTest";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "FIONAYL0510";


    public List<CtrainABTestName> query(String sql) throws IOException, ParseException {
        Connection conn = null;
        Statement stmt = null;
        List<CtrainABTestName> retList = new ArrayList<>();

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
                CtrainABTestName ctrainABTestName = new CtrainABTestName();
                int id  = rs.getInt("id");
                String exNum = rs.getString("exnum");
                String exCnName = rs.getString("excname");


                ctrainABTestName.setId(id);
                ctrainABTestName.setExNum(exNum);
                ctrainABTestName.setexCnName(exCnName);


                retList.add(ctrainABTestName);
                System.out.println(ctrainABTestName);
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


}
