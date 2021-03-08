package org.vic;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
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

    @Ignore
    public void countOff() {
        GameNumberOff gameNumberOff = new GameNumberOff();
        List<String> testOutcome = gameNumberOff.countOff(100);
        gameNumberOff.showOutcome(testOutcome);

        //Assert.assertEquals(TOPLIMITED,testOutcome.size());

        //Assert.assertEquals("fizzbuzz",testOutcome.get(15-1));

    }

    @Ignore
    public void answer() {
        GameNumberOff gameNumberOff = new GameNumberOff();

        String data = "1";
        String input;
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            input = gameNumberOff.answer();
        } finally {
            System.setIn(stdin);
        }
        System.out.println("input is----" + input);
    }

    @Test
    public void answer_by_console(){
        GameNumberOff gameNumberOff = new GameNumberOff();
        String input = gameNumberOff.answer();
        Assert.assertEquals("38",input);
    }

    @Ignore
    public void vary() {
        GameNumberOff gameNumberOff = new GameNumberOff();
        Assert.assertEquals("fizz",gameNumberOff.vary(3));
        Assert.assertEquals("buzz",gameNumberOff.vary(5));
        Assert.assertEquals("fizzbuzz",gameNumberOff.vary(15));
        Assert.assertEquals("7",gameNumberOff.vary(7));
    }
}