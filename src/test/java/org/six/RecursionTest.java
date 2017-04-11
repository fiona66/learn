package org.six;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yanglu on 4/11/17.
 */
public class RecursionTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void recursionTest() throws Exception{
        Recursion rec = new Recursion();
        System.out.println(rec.recursion(5));
        Assert.assertEquals(rec.recursion(5),120);
    }

}