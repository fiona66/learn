package org.six.util;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yanglu on 6/5/17.
 */
public class JDBCDemoTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }
    @Test
    public void testAddMinPriceToMySQL() throws Exception{
        JDBCDemo jdbcDemo = new JDBCDemo();
        jdbcDemo.addToMySQL();
    }

}