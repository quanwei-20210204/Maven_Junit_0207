package org.vic;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class TakeAnswerTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    private static ByteArrayInputStream in;

    public void setInput(String input) {
        in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
    }

    @Test
    public void answer() {
        String data = "one\n"
                + "two\n"
                + "three\n"
                + "four\n"
                + "five\n";
        setInput(data);
        TakeAnswer takeAnswer = new TakeAnswer();
        takeAnswer.answer();
        takeAnswer.answer();

        Assert.assertEquals("three",takeAnswer.answer());

    }

}