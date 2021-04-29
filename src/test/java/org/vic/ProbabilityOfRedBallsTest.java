package org.vic;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class ProbabilityOfRedBallsTest {

    @Test
    public void mixBallsBox(){
        ProbabilityOfRedBalls probability = new ProbabilityOfRedBalls();
        List<Integer> list = probability.mixBallsBox();
        Assert.assertEquals(true,list.size()!=0);
    }

    @Test
    public void whichBallIsFirstEmpty() {
        int whichBall = 0;

        for(int i = 0; i < 20000; i++) {
            ProbabilityOfRedBalls probability = new ProbabilityOfRedBalls();
            List<Integer> ballsBox = probability.mixBallsBox();
            whichBall += probability.whichBallIsFirstEmpty(ballsBox, 30, 30, 30);
        }
        Assert.assertEquals(0, whichBall);
    }

    @Test
    public void probabilityOfOneMillionTimes(){
        ProbabilityOfRedBalls probability = new ProbabilityOfRedBalls();
        float proba = probability.probabilityOfOneMillionTimes(30,30,30);
        Assert.assertEquals(0.33,proba,0.001);

    }

    @Test
    public void calculateProbability(){
        ProbabilityOfRedBalls probability = new ProbabilityOfRedBalls();
        float proba = probability.calculateProbability(10,20);
        Assert.assertEquals(0.5,proba,0.001);
    }

}