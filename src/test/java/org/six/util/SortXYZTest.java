package org.six.util;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.six.util.SortXYZ.Sort;

/**
 * Created by yanglu on 4/20/17.
 */
public class SortXYZTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void SortTest() throws Exception{
        Sort(35,32,90);
        Sort(813,740,182);
        Sort(20,50,82);
        Sort(50,50,15);
        Sort(10,12,10);

    }

}