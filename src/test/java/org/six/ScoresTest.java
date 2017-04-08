package org.six;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yanglu on 4/8/17.
 */
public class ScoresTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void divideScoretTest() throws Exception{
        Scores scores = new Scores();
        Assert.assertEquals("A",scores.ScoreDivided(95));
        Assert.assertEquals("C",scores.ScoreDivided(40));
        Assert.assertEquals("B",scores.ScoreDivided(72));
    }

}