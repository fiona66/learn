package com.abtest.web;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by yanglu on 8/20/17.
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String index(){
        return "Hello World";
    }


    @RequestMapping("/getABtest")
    public Object getABtest() throws IOException {
        GetAbTest getAbTest = new GetAbTest();
        return getAbTest.getAB("_tra");

    }


    @RequestMapping("/index")
    public String helloJsp(@RequestParam(value = "clientId", required = false)String clientId, Map<String, Object> model) throws IOException {

        if (!StringUtils.isEmpty(clientId)) {
            GetAbTest getAbTest = new GetAbTest();
//            String result = String.valueOf(getAbTest.getAB("_tra"));
            List result = getAbTest.getAB("_tra");
            model.put("result", result);
        }
        return "helloJsp";
    }

}
