package com.abtest.web;

import com.abtest.dao.CtrainABTestNameDAO;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Map;

/**
 * Created by yanglu on 8/20/17.
 */
@Controller
public class HelloController {
    @RequestMapping("/index")
    public String helloJsp(@RequestParam(value = "clientId", required = false) String clientId, Map<String, Object> model) throws IOException, ParseException {
        System.out.println(clientId);
        CtrainABTestNameDAO ctrainABTestNameDAO = new CtrainABTestNameDAO();
        List appResult = ctrainABTestNameDAO.query("select * from abTest where source=0");
        List serviceResult = ctrainABTestNameDAO.query("select * from abTest where source=1 ");
        GetAbTest getAbTest = new GetAbTest();
        if (!StringUtils.isEmpty(clientId)){
            if (!appResult.isEmpty()) {
                List resultPage = getAbTest.getAB("_tra", clientId);
                model.put("resultPage", resultPage);
            }
            if (!serviceResult.isEmpty()) {
                List resultService = getAbTest.getABTestFromService(clientId);
                model.put("resultService", resultService);
            }
        }
    return  "helloJsp";
    }
}


//        if (!StringUtils.isEmpty(clientId)) {
//            GetAbTest getAbTest = new GetAbTest();
////            List result = getAbTest.getAB("_tra",clientId);
//            List result = getAbTest.getABTestFromService(clientId);
//            model.put("result", result);
//        }
//        return "helloJsp";
//    }
//}