package org.six.util;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.six.util.Recursion.caculateRecursion;

/**
 * Created by yanglu on 4/20/17.
 */
public class RecursionTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void RecursionTest() throws Exception{
        System.out.println("5的阶乘为"+caculateRecursion(5));
        Assert.assertEquals(caculateRecursion(5),120);
    }

}