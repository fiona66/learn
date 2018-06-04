package com.abtest.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by yanglu on 8/20/17.
 */
@SpringBootApplication
@ComponentScan(basePackageClasses = HelloController.class)
public class Chapter1Application {
    public static void main(String[] args) {

        SpringApplication.run(Chapter1Application.class,args);
    }
}
