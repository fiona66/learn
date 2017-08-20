package com.abtest.web;

import com.google.gson.Gson;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by yanglu on 8/20/17.
 */
public class GetAbTest {

    public String getAB() throws IOException {
        Document document = Jsoup.connect("https://m.ctrip.com/restapi/soa2/10290/abtest.json")
                .data("ClientID", "12001048410016413426")
                .ignoreContentType(true)
                .userAgent("Chrome")
                .get();

        String json = document.text();
        Gson gson = new Gson();
        HashMap res = gson.fromJson(json, HashMap.class);
        Object value3 = res.get("Result");
        HashMap[] arrays = gson.fromJson(value3.toString(), HashMap[].class);
        String value4 = value3.toString();
        return value4;
    }
}
