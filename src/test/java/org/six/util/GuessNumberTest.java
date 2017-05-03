package org.six.util;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yanglu on 5/3/17.
 */
public class GuessNumberTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGuessNumber() throws Exception{
        GuessNumber guessNumber=new GuessNumber();
        guessNumber.isRightNumber(30);
        guessNumber.isRightNumber(100);
        guessNumber.isRightNumber(423);
    }

}