package com.abtest.web;

import com.abtest.dao.CtrainABTestNameDAO;
import com.abtest.domain.CtrainABTestName;
import com.google.gson.Gson;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yanglu on 8/20/17.
 */
public class GetAbTest {

    public List<Map> getAB(String searchword, String clientid) throws IOException, ParseException {
        CtrainABTestNameDAO ctrainABTestNameDAO = new CtrainABTestNameDAO();
        List<CtrainABTestName> abresult = ctrainABTestNameDAO.query("select * from abTest where source=0");

        Document document = Jsoup.connect("http://m.ctrip.com/restapi/soa2/10290/abtest.json")
                .data("ClientID", clientid)
                .ignoreContentType(true)
                .userAgent("Chrome")
                .get();

        String json = document.text();
        Gson gson = new Gson();
        HashMap res = gson.fromJson(json, HashMap.class);
        Object value3 = res.get("Result");
        HashMap[] arrays = gson.fromJson(value3.toString(), HashMap[].class);
        List<Map> list = new ArrayList<>();
        for (int i = 0; i < arrays.length; i++) {
            Map<String, Object> map = new HashMap<String, Object>();
            Object value5 = arrays[i].get("ExpCode");
            Object value6 = arrays[i].get("ExpVersion");

            if (value5.toString().contains(searchword)) {
                map.put("ExpCode", value5);
                CtrainABTestName value7 = existInList(value5.toString(), abresult);
                map.put("ExpVersion", value6);


                if (value7 != null) {
                    map.put("ExCnName", value7.getExCnName());
                    map.put("ExInstructions", value7.getInStrucTions());
                    list.add(map);
                }
            }
        }
        return list;
    }

    private CtrainABTestName existInList(String name, List<CtrainABTestName> abresult) {
        for (int i = 0; i < abresult.size(); i++) {
            if (abresult.get(i).getExNum().equals(name)) {
//                String exCnName=abresult.get(i).getExCnName();
                CtrainABTestName exInfo = abresult.get(i);
                return exInfo;
            }
        }
        return null;

    }

    public List<Map> getABTestFromService(String ClientID) throws IOException, ParseException {
        CtrainABTestNameDAO serviceExperiment = new CtrainABTestNameDAO();
        List<CtrainABTestName> serviceAbResult = serviceExperiment.query("select * from abTest where source=1 ");
        List<Map> list = new ArrayList<>();
        for (int i = 0; i < serviceAbResult.size(); i++) {
            Map<String, Object> map = new HashMap<String, Object>();
            Object exNum=serviceAbResult.get(i).getExNum();
            String stringExNum=exNum.toString();
            map.put("ExpCode",exNum);

            Document document = Jsoup.connect("http://10.2.46.178/train-product-service/api/json/GetABTestVersionForClientID")
                    .data("ClientID",ClientID)
                    .data("ABTestExpName", stringExNum)
                    .ignoreContentType(true)
                    .userAgent("Chrome")
                    .get();

            String json = document.text();
            Gson gson = new Gson();
            HashMap res = gson.fromJson(json, HashMap.class);
            Object serviceResult = res.get("ABTestValue");

            map.put("ExpVersion",serviceResult);
            map.put("ExCnName", serviceAbResult.get(i).getExCnName());
            map.put("ExInstructions", serviceAbResult.get(i).getInStrucTions());
            list.add(map);

        }
        System.out.println(list);
        return list;
    }
}


