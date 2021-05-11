package org.vic.countoffgame;

import org.junit.*;
import org.vic.countoffgame.PrintAnswers;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class PrintAnswersTest {
    final static int NUMBER = 3;
    final static ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeClass
    public static void setOut(){
        System.setOut(new PrintStream(outContent));
    }

    @AfterClass
    public static void reSetOut(){
        System.setOut(System.out);
    }
    @Before
    public void setUp() throws Exception {
        outContent.reset();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void showOutcome() {
        List<String> list = new ArrayList<>(NUMBER);
        list.add("1");
        list.add("2");
        list.add("fizz");
        PrintAnswers.showOutcome(list);
        Assert.assertEquals("1\r\n2\r\nfizz\r\n",outContent.toString());
    }

    @Test
    public void showCurrentResult() {
        PrintAnswers.showCurrentResult("1");
        Assert.assertEquals("1\r\n",outContent.toString());
    }
}