package org.vic;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.file.StandardWatchEventKinds;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GameNumberOffTest {
    public static final int TOPLIMITED = 100;

    @Before
    public void setUp() throws Exception {
        System.out.println("-----------test begins-----------");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("-----------test ends-----------");
    }

    @Ignore
    public void showOutcome() {

    }

    private static ByteArrayInputStream in;

    public void setInput(String input) {
        in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
    }

    @Ignore
    public void countOff() {
        String data = "6\n"
                + "fizz\n"
                + "three\n"
                + "four\n"
                + "five\n";
        setInput(data);
        //GameNumberOff gameNumberOff = new GameNumberOff();
        //gameNumberOff.countOff(50,8);
        //PrintAnswers.showOutcome(testOutcome);
    }

    @Ignore
    public void vary() {
        //GameNumberOff gameNumberOff = new GameNumberOff();
        //Assert.assertEquals("fizz",gameNumberOff.vary(3));
        //Assert.assertEquals("buzz",gameNumberOff.vary(5));
        //Assert.assertEquals("fizzbuzz",gameNumberOff.vary(15));
        //Assert.assertEquals("7",gameNumberOff.vary(7));
    }
}