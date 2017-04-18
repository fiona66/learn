package org.six.util;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.six.util.NarcissisticNumber.isNarcissisticNumber;

/**
 * Created by yanglu on 4/18/17.
 */
public class NarcissisticNumberTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void NarcissisticNumberTest() throws Exception{
        int count=0;
        for(int i=100;i<1000;i++){
            if(isNarcissisticNumber(i)){
                count++;
                System.out.println(i+"是水仙花数");
            }
        }
        System.out.println("100-999间的水仙花数共有"+count+"个");
        Assert.assertEquals(count,4);
    }

}