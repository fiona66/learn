package org.six.util;

import com.google.gson.Gson;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;

/**
 * Created by yanglu on 5/7/17.
 */
public class FlightDemo {
    public static void main(String[] args) throws ParseException, IOException {
//        Connection con =Jsoup.connect("http://flights.ch.com/Flights/SearchByTime");
        Document document = Jsoup.connect("https://flights.ch.com/Flights/SearchByTime")
                .data("Currency", "0")
                .data("SType", "0")
                .data("Departure", "沙巴")
                .data("Arrival","上海")
                .data("DepartureDate", "2017-06-03")
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
        System.out.println(document.toString());
        String json = document.text();
        Gson gson=new Gson();
        HashMap res = gson.fromJson(json, HashMap.class);
        Object value1 =res.get("MinPrice");
        Double value2 = (Double) value1;
        Integer value3 = value2.intValue();
        System.out.println(value3);
//        System.out.println(res.keySet());

    }
}
