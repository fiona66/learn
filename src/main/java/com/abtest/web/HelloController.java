package com.abtest.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * Created by yanglu on 8/20/17.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index(){
        return "Hello World";
    }


    @RequestMapping("/getABtest")
    public Object getABtest() throws IOException {
        GetAbTest getAbTest = new GetAbTest();
        return getAbTest.getAB();

    }
}
