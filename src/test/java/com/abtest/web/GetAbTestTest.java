package com.abtest.web;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by yanglu on 9/17/17.
 */
public class GetAbTestTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void getABTest() throws Exception{
        GetAbTest getAbTest=new GetAbTest();
//        System.out.println(getAbTest.getAB("_tra","12001149610041198210"));
//        getAbTest.getAB("_tra","12001149610041198210");
        getAbTest.getABTestFromService("32001124810056535651");

    }

}