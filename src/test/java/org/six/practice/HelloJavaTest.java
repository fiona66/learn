package org.six.practice;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sun.jvm.hotspot.HelloWorld;

import static org.junit.Assert.*;

/**
 * Created by yanglu on 3/19/17.
 */
public class HelloJavaTest {


    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void helloWorld() throws Exception {
        HelloJava helloJava = new HelloJava();

        String ret = helloJava.helloWorld();

        Assert.assertEquals("hello world, hello java", ret);

    }

    @Test
    public void testHelloWater() throws Exception {
        HelloJava helloWater = new HelloJava();

        String ret = helloWater.helloWater();

        Assert.assertEquals("hello water, hello java", ret);
        Assert.assertNotEquals("hello world, hello java", ret);

    }
}