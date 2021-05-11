package org.vic.countoffgame;

import junit.framework.Assert;
import org.junit.*;
import org.vic.countoffgame.HelloSAP;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

//task 2-3, unit test for class HelloSAP, only one method
public class HelloSAPTest {
    private PrintStream oldOut;
    private OutputStream outAndOut;

    @Before
    public void setUp() throws Exception{
        oldOut = System.out;
        outAndOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outAndOut));
    }

    @After
    public void tearDown() throws Exception{
        System.setOut(oldOut);
    }

    @Ignore
    public void need_show_usage_when_actual_value_wrong(){
        HelloSAP.main(new String[]{"NA"});
        Assert.assertEquals("Wrong format: number needed.\r\n",outAndOut.toString());
    }

}