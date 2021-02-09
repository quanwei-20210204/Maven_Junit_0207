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
    static Collection<String> collectionTest = new ArrayList<String>();

    private static HelloSAP h=new HelloSAP();

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
    public void testHello_world() {
        collectionTest.add("buzz");
        h.Hello_world();
        Assert.assertEquals(collectionTest,HelloSAP.collection);
    }
}