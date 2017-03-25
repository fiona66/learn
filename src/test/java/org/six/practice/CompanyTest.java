package org.six.practice;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

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

    @Test
    public void testyiguoSentOffer(){
        // 实例化一个名叫yiguo的对象并赋值
        Company yiguo = new Company("哔哩哔哩", 11, "上海长宁区金钟路999号C座易贸大厦8楼");
        // 赋值,将该对象调用hasSentOfferToSix这个方法的值给offer
        boolean offer = yiguo.hasSentOfferToSix();
        // 断言返回的offer值是否是true(易果有发offer,所以此处返回为true才是正确的)
        Assert.assertEquals(false, offer);

    }

    @Test
    public void testSentOfferToSix(){
        //demo code. 涉及高级特性 泛型.
        ArrayList<Company> companies = new ArrayList<>();  //创建一个list.
        Company company = new Company("test", 1, "test address");
        companies.add(company);  // 塞进去一个元素.

        //遍历一个list.
        for (int i = 0; i < companies.size(); i++) {
            // do something.
            System.out.println(companies.get(i));

        }

        //遍历list  方式二
        for (Company comp : companies) {
            // do something.
            System.out.println(comp);
        }





        // 创建5个company对象放入list<company>中

        // 循环遍历list中的5个公司,调用hasSentOfferToSix方法
        // 若给了offer,打印“(该公司)给六六发了Offer”,计数器+1
        // 若未给offer,则打印“(该公司)没有给六六发Offer”


        // 断言,计数器的值是否为4
    }
}