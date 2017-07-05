package org.six.util;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yanglu on 7/5/17.
 */
public class CylinderTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void circleTest() throws Exception{
        Circle circle = new Circle(3);
        circle.show();
        Cylinder cylinder = new Cylinder(3,6);
        cylinder.showVolume();
    }

}