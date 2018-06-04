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
                .data("ClientID","12001048410016413426")
                .ignoreContentType(true)
                .userAgent("Chrome")
                .get();

        String json = document.text();
        Gson gson=new Gson();
        HashMap res = gson.fromJson(json, HashMap.class);
        System.out.println(res);
        Object value3 =res.get("Result");
        System.out.println(value3);
        HashMap[] arrays = gson.fromJson(value3.toString(), HashMap[].class);
        System.out.println(arrays.length);
        for(int i=0;i<arrays.length;i++){
//            System.out.println(arrays[i]);
            Object value4 = arrays[i].get("ExpCode");
            Object value5 = arrays[i].get("ExpVersion");
            if(value4.toString().contains("_tra_")){
                System.out.println(value4);
                System.out.println(value5);
            }

        }

    }
}
