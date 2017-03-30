package org.six;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by yanglu on 3/30/17.
 */
public class CompanyTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testHasSentOfferToSix() throws Exception {
        ArrayList<Company> companies = new ArrayList<>();
        Company yiguo = new Company("易果生鲜",11,"上海市长宁区金钟路");
        Company liulishuo  = new Company("英语流利说",5,"上海市杨浦区海上海商务楼");
        Company bilibili = new Company("哔哩哔哩",10,"上海市浦东新区航运大厦");
        Company teambition = new Company("Teambition",7,"上海市张江高科畅星大厦");
        Company ctrip = new Company("携程",18,"上海市长宁区金钟路凌空SOHO");

        companies.add(yiguo);
        companies.add(liulishuo);
        companies.add(bilibili);
        companies.add(teambition);
        companies.add(ctrip);

        int counter = 0;
        for(int i=0; i<companies.size();i++){
            Company company = companies.get(i);
            if(companies.get(i).hasSentOfferToSix()){
                System.out.println(company.getCompanyName()+"给六六发了offer");
                counter++;
            }else {
                System.out.println(company.getCompanyName()+"没有给六六发offer");
            }
        }

        Assert.assertEquals(counter,4);
    }

}