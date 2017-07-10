package org.six.util;

import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

/**
 * Created by yanglu on 5/7/17.
 */
public class FlightDemo {
    public String getDepartureTime(int afterToday){
        Calendar cal = Calendar.getInstance();//使用默认时区和语言环境获得一个日历。
        cal.add(Calendar.DAY_OF_MONTH, afterToday);//取当前日期之后的*天.

        SimpleDateFormat departureTime = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(departureTime.format(new Date()));
        System.out.println(departureTime.format(cal.getTime()));
        String departureTimeAfterToday=departureTime.format(cal.getTime());
        return departureTimeAfterToday;
    }

    public int getMinPrice(int afterToday) throws ParseException, IOException {

        Document document = Jsoup.connect("https://flights.ch.com/Flights/SearchByTime")
                .data("Currency", "0")
                .data("SType", "0")
                .data("Departure", "沙巴")
                .data("Arrival","上海")
                .data("DepartureDate", String.valueOf(getDepartureTime(afterToday)))
                .data("ReturnDate","")
                .data("IsIJFlight", "false")
                .data("IsBg", "false")
                .data("IsEmployee", "false")
                .data("IsLittleGroupFlight", "false")
                .data("SeatsNum", "1")
                .data("ActId", "0")
                .data("IfRet", "false")
                .ignoreContentType(true)
                .userAgent("Chrome")
                .post();
        String json = document.text();
        Gson gson=new Gson();
        HashMap res = gson.fromJson(json, HashMap.class);
        Object value1 =res.get("MinPrice");
        Double value2 = (Double) value1;
        Integer minprice = value2.intValue();
        System.out.println(minprice);
        return minprice;
    }


    public Object getFlightNumber(int afterToday) throws IOException {
        Document document = Jsoup.connect("https://flights.ch.com/Flights/SearchByTime")
                .data("Currency", "0")
                .data("SType", "0")
                .data("Departure", "沙巴")
                .data("Arrival","上海")
                .data("DepartureDate",  String.valueOf(getDepartureTime(afterToday)))
                .data("ReturnDate","")
                .data("IsIJFlight", "false")
                .data("IsBg", "false")
                .data("IsEmployee", "false")
                .data("IsLittleGroupFlight", "false")
                .data("SeatsNum", "1")
                .data("ActId", "0")
                .data("IfRet", "false")
                .ignoreContentType(true)
                .userAgent("Chrome")
                .post();
        String json = document.text();
        Gson gson=new Gson();
        HashMap res = gson.fromJson(json, HashMap.class);
        System.out.println(res);
        Object value3 =res.get("Route");
        System.out.println(value3);
        ArrayList list_1 = (ArrayList) value3;
        ArrayList list_2 = (ArrayList) list_1.get(0);
        LinkedTreeMap treeMap = (LinkedTreeMap) list_2.get(0);
        System.out.println(list_2.get(0));

        Object value4 = treeMap.get("Type");
        String flightNumber = value4.toString();
        System.out.println(flightNumber);

        return flightNumber;

    }

}
