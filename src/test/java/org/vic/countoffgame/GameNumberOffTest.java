package org.vic.countoffgame;

import org.junit.*;
import org.vic.countoffgame.GameNumberOff;
import org.vic.countoffgame.PrintAnswers;
import org.vic.countoffgame.TakeAnswer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameNumberOffTest {
    public static final int TOPLIMITED = 100;

    @Before
    public void setUp() throws Exception {
        System.out.println("-----------Game Number_Off test begins-----------");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("-----------test ends-----------");
    }

    static class TestPrint extends PrintAnswers {
        private final List<String> allPrintAnswers = new ArrayList<>();
        @Override
        public void print(String answers){
            allPrintAnswers.add(answers);
        }

        public List<String> getAllAnswersOut(){
            return allPrintAnswers;
        }
    }

    static class TestTakeAnswers extends TakeAnswer {
        private List<String> answers;
        private int counter;

        public TestTakeAnswers(){
            answers = new ArrayList<>();
            answers.add("fizz");
            answers.add("11");
        }

        @Override
        public String answer() {
            counter++;
            return answers.remove(0);
        }

        public int getAnswerCounter() {
            return counter;
        }

        public void setTestAnswers(String... answer) {
            answers.clear();
            answers.addAll(Arrays.asList(answer));
        }

    }

    private final TestPrint testPrint = new TestPrint();
    private final TestTakeAnswers testTakeAnswer = new TestTakeAnswers();

    GameNumberOff gameNumberOff = new GameNumberOff(testPrint,testTakeAnswer);


    @Test
    public void need_vary_3_to_fizz() {
        Assert.assertEquals("fizz",gameNumberOff.vary(3));
    }

    @Ignore
    public void need_number_off_to_topLimit_and_vary(){
        List<String> expectedResult = Arrays.asList("1", "2", "fizz", "4", "buzz", "fizz","7", "8", "fizz",
                "buzz","11", "fizz", "13", "14","fizzbuzz");
        gameNumberOff.countOff(15,8);
        Assert.assertEquals(expectedResult,testPrint.getAllAnswersOut());
    }

    @Test
    public void need_stop_count_when_wrong_answer(){
        testTakeAnswer.setTestAnswers("fizz");
        gameNumberOff.countOff(15,8);
        Assert.assertEquals(1,testTakeAnswer.getAnswerCounter());
    }

    @Ignore
    public void need_continue_count_to_end(){
        testTakeAnswer.setTestAnswers("4", "fizz","buzz","28");
        gameNumberOff.countOff(30,8);
        Assert.assertEquals(4,testTakeAnswer.getAnswerCounter());
    }
}