package org.six.practice;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yanglu on 3/24/17.
 */
public class CompanyTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testCompany(){
        Company yiguo = new Company("易果生鲜", 11, "上海长宁区金钟路999号C座易贸大厦8楼");
        System.out.println(yiguo);
        // 接收易果生鲜的公司信息
        String ret = yiguo.toString();

        Assert.assertTrue(ret.contains("易果生鲜"));
    }

}