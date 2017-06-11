package org.six.util;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by yanglu on 6/11/17.
 */
public class FlightDemoTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }
    @Test
    public void testAddFlightDateToMySQL() throws Exception{
        FlightDemo flightDemo = new FlightDemo();
        JDBCDemo jdbcDemo = new JDBCDemo();
//        for(int i =1;i<20;i++){
//            flightDemo.getDepartureTime(i);
//            flightDemo.getMinPrice(i);
//            flightDemo.getFlightNumber(i);
//            jdbcDemo.addToMySQL(i);
//        }
        List<FlightEveryDayMinPrice> flightEveryDayMinPriceList=jdbcDemo.query("select * from flightminprice where departure_date between '2017-06-12' and '2017-06-30' ;");
        System.out.println(flightEveryDayMinPriceList);

        SendEmailDemo sendEmailDemo = new SendEmailDemo();
        sendEmailDemo.SendEmail(1);
    }

}