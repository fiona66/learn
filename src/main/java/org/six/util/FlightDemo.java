package org.six.util;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;

/**
 * Created by yanglu on 5/7/17.
 */
public class FlightDemo {
    public int getMinPrice() throws ParseException, IOException {
        Document document = Jsoup.connect("https://flights.ch.com/Flights/SearchByTime")
                .data("Currency", "0")
                .data("SType", "0")
                .data("Departure", "沙巴")
                .data("Arrival","上海")
                .data("DepartureDate", "2017-06-08")
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


    public Object getFlightNumber() throws IOException {
        Document document = Jsoup.connect("https://flights.ch.com/Flights/SearchByTime")
                .data("Currency", "0")
                .data("SType", "0")
                .data("Departure", "沙巴")
                .data("Arrival","上海")
                .data("DepartureDate", "2017-06-08")
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
        Object value3 =res.get("Route");
        System.out.println(value3);
//        String value4 = document.text();
        HashMap res1 = gson.fromJson((JsonElement) value3,HashMap.class);
        Object value4 = res1.get("Type");
        String flightNumber = value4.toString();
        System.out.println(flightNumber);

        return flightNumber;
    }
}
