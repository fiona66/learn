package org.six;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yanglu on 4/8/17.
 */
public class SortABCTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void resultTest() throws Exception{
        new SortABC(35,32,90);
        new SortABC(813,740,182);
        new SortABC(20,50,82);
        new SortABC(32,95,46);
        new SortABC(47,96,33);
    }

}