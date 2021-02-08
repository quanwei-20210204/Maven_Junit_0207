package org.vic;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//task 2-3, unit test for class HelloSAP, only one method
public class HelloSAPTest extends TestCase {

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
        h.Hello_world();
    }
}