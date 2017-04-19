package org.six.util;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.six.util.Scores.printScores;

/**
 * Created by yanglu on 4/19/17.
 */
public class ScoresTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void ScoresTest() throws Exception{
        Assert.assertEquals(printScores(94),"A");
        Assert.assertEquals(printScores(77),"B");
        Assert.assertEquals(printScores(46),"C");
    }

}