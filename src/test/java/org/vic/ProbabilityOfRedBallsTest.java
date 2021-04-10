package org.vic;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ProbabilityOfRedBallsTest {


    @Test
    public void mixBallsBox(){
        ProbabilityOfRedBalls probability = new ProbabilityOfRedBalls();
        List<Integer> list = probability.mixBallsBox();
        for(Integer i:list){
            System.out.print(i);
        }
    }

    @Test
    public  void getABallOut(){
        ProbabilityOfRedBalls probability = new ProbabilityOfRedBalls();
        List<Integer> list = probability.mixBallsBox();
        probability.getABallOut(list);

    }
    @Test
    public void whichBallIsFirstEmpty() {
        int whichBall = 0;

        for(int i = 0; i < 20000; i++){
        ProbabilityOfRedBalls probability = new ProbabilityOfRedBalls();
        whichBall += probability.whichBallIsFirstEmpty();
        }

        Assert.assertEquals(0, whichBall);
    }

    @Ignore
    public void probabilityOfOneMillionTimes(){
        ProbabilityOfRedBalls probability = new ProbabilityOfRedBalls();
        //probability.probabilityOfOneMillionTimes();

    }

}