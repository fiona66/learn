package org.six.practice;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

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
        // 创建5个company对象放入list<company>中
        ArrayList<Company> companies = new ArrayList<>();
        Company yiguo = new Company("易果生鲜",11, "上海长宁区金钟路999号C座易贸大厦");
        Company liulishuo = new Company("英语流利说",5,"上海杨浦区大连路970号海上海");
        Company bilibili = new Company("哔哩哔哩",8,"上海市浦东新区浦东大道720号国际航运金融大厦 ");
        Company teambition = new Company("Teambition",6,"上海浦东新区上海市浦东新区畅星大厦");
        Company ctrip = new Company("携程",18,"上海长宁区金钟路968号凌空SOHO");

        companies.add(yiguo);
        companies.add(liulishuo);
        companies.add(bilibili);
        companies.add(teambition);
        companies.add(ctrip);

        // 循环遍历list中的5个公司,调用hasSentOfferToSix方法
        // 若给了offer,打印“(该公司)给六六发了Offer”,计数器+1
        // 若未给offer,则打印“(该公司)没有给六六发Offer”
        int counter = 0;
        for (int i = 0; i < companies.size(); i++) {
            Company company= companies.get(i);
            if(companies.get(i).hasSentOfferToSix()){
                System.out.println(company.getCompanyName()+"给六六发了offer");
                counter = counter + 1;
            }else{
                System.out.println(company.getCompanyName()+"没有给六六发offer");
            }
        }

        // 断言,计数器的值是否为4
        Assert.assertEquals(4,counter);

    }
}