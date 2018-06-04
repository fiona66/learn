package org.six.util;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yanglu on 7/4/17.
 */
public class EntranceTicketsTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void entranceTicketsTest() throws Exception {
        EntranceTickets entranceTickets=new EntranceTickets();
        entranceTickets.EntranceTickets(10);
        entranceTickets.EntranceTickets(33);
        entranceTickets.EntranceTickets(77);
    }

}