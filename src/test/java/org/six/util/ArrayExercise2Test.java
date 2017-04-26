package org.six.util;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.six.util.ArrayExercise2.AverageScore;

/**
 * Created by yanglu on 4/23/17.
 */
public class ArrayExercise2Test {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void printScoresTest() throws Exception {
        double[] scores = {1,2,3,4,5,6,7,8,9,10};
        AverageScore(scores);
    }

}