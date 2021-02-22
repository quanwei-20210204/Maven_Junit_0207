package org.vic;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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

        List<String> testOutcome = new ArrayList<>();

        testOutcome = helloSAP.countOff();

        Assert.assertEquals(100,testOutcome.size());

        Assert.assertEquals("fizzbuzz",testOutcome.get(15-1));

    }

    @Test
    public void testVary() {

        Assert.assertEquals("fizz",helloSAP.vary(3));

    }

}