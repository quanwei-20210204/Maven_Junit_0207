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

public class TakeAnswerTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }


    static class TestTakeAnswer extends TakeAnswer{
        private List<String> answers;

        public TestTakeAnswer(){
            answers = new ArrayList<>();
            answers.add("1");
            answers.add("11");
        }

        @Override
        public String answer(){
            return answers.remove(0);
        }

    }
    private final TestTakeAnswer answer= new TestTakeAnswer();


    @Test
    public void what_is_the_answer(){
        answer.answer();
        assertEquals("11", answer.answer());
    }

    private static ByteArrayInputStream in;

    public void setInput(String input) {
        in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
    }

    @Ignore
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