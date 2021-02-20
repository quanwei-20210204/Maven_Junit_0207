package org.vic;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

//task 2-3, unit test for class HelloSAP, only one method
public class HelloSAPTest extends TestCase {

    public HelloSAP helloSAP = new HelloSAP();

    @Before
    public void setUp() throws Exception {
        super.setUp();
        System.out.println("test begin");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("test ends");
    }

    @Test
    public void testCountOff() {

        helloSAP.countOff(); // call the method countOff()
        helloSAP.resultSize();  // check the size of the result
        System.out.println("the result contains 3 is "+ helloSAP.ifContains("3")); //check if the result contains special number;
        helloSAP.showResult();

    }
}