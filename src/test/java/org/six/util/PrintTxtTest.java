package org.six.util;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yanglu on 7/10/17.
 */
public class PrintTxtTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void printTxtTest() throws Exception {
        int array[]={100, 101, 102, 103, 104, 105};

        PrintTxt printTxt = new PrintTxt();
        printTxt.addTxt(array);
    }

}