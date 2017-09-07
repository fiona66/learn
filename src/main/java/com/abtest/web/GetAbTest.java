package com.abtest.web;

import com.google.gson.Gson;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yanglu on 8/20/17.
 */
public class GetAbTest {

    public List<Map> getAB(String searchword) throws IOException {
        Document document = Jsoup.connect("https://m.ctrip.com/restapi/soa2/10290/abtest.json")
                .data("ClientID", "12001048410016413426")
                .ignoreContentType(true)
                .userAgent("Chrome")
                .get();

        String json = document.text();
        Gson gson = new Gson();
        HashMap res = gson.fromJson(json, HashMap.class);
        Object value3 = res.get("Result");
        String value4 = value3.toString();
        HashMap[] arrays = gson.fromJson(value3.toString(), HashMap[].class);
        List<Map> list = new ArrayList<>();
        for(int i=0;i<arrays.length;i++){
            Map<String,Object> map = new HashMap<String,Object>();
            Object value5 = arrays[i].get("ExpCode");
            Object value6 = arrays[i].get("ExpVersion");
            if(value5.toString().contains(searchword)) {
                map.put("ExpCode", value5);
                map.put("ExpVersion", value6);
                if(!value5.equals("161012_tra_norc2"))
                    list.add(map);
            }
        }
        return list;
    }
}
