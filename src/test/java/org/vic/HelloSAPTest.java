package org.vic;

import junit.framework.Assert;
import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

//task 2-3, unit test for class HelloSAP, only one method
public class HelloSAPTest {

    @BeforeClass
    public static void setUp() throws Exception {
        System.out.println("test begin");
    }

    @AfterClass
    public static void tearDown() throws Exception {
        System.out.println("test ends");
    }

}