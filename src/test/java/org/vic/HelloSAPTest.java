package org.vic;

import com.sun.org.apache.xpath.internal.objects.XString;
import junit.framework.Assert;
//import junit.framework.TestCase;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

//task 2-3, unit test for class HelloSAP, only one method
@RunWith(Parameterized.class)
public class HelloSAPTest /*extends TestCase*/ {

    public HelloSAP helloSAP = new HelloSAP();

    @Parameterized.Parameters
    public static Collection testData(){
        return Arrays.asList(new Object[][]{{"1",1},{"2",2},{"fizz",3}});
    }


    private String hExpected;
    private int hInput;
    public HelloSAPTest(String expected,int input){
        hExpected = expected;
        hInput = input;
    }


    @BeforeClass
    public static void setUp() throws Exception {
        //super.setUp();

        System.out.println("test begin");
    }

    @AfterClass
    public static void tearDown() throws Exception {
        System.out.println("test ends");
    }

    @Ignore
    public void countOff() {

        List<String> testOutcome = new ArrayList<>();

        testOutcome = helloSAP.countOff();

        Assert.assertEquals(100,testOutcome.size());

        Assert.assertEquals("fizzbuzz",testOutcome.get(15-1));

    }

    @Test
    public void vary() {

        Assert.assertEquals("fizz",helloSAP.vary(3));
        Assert.assertEquals("buzz",helloSAP.vary(5));
        Assert.assertEquals("fizzbuzz",helloSAP.vary(15));
        Assert.assertEquals("7",helloSAP.vary(7));

        Assert.assertEquals(hExpected,helloSAP.vary(hInput));



    }

}