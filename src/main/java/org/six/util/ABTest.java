package org.six.util;

import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by yanglu on 7/10/17.
 */
public class ABTest {
    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect("https://m.ctrip.com/restapi/soa2/10290/abtest.json")
                .ignoreContentType(true)
                .userAgent("Chrome")
                .get();

        String json = document.text();
        Gson gson=new Gson();
        HashMap res = gson.fromJson(json, HashMap.class);
        Object value3 =res.get("Result");
        System.out.println(value3);
//        ArrayList list_1 = (ArrayList) value3;
//        ArrayList list_2 = (ArrayList) list_1.get(0);
//        System.out.println(list_2.get(0));
//        String aa=value3.toString();

    }
}
