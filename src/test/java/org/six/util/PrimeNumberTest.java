package org.six.util;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.six.util.PrimeNumber.isPrimeNumber;

/**
 * Created by yanglu on 4/18/17.
 */
public class PrimeNumberTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testPrimeNumber() throws Exception{
        int count=0;
        for(int i=101;i<200;i++){
            if(isPrimeNumber(i)){
                count++;
                System.out.println(i+"是素数");
            }
        }
        System.out.println("100-200之间的素数有:"+count+"个");
        Assert.assertEquals(count,21);
    }


}