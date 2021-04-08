package org.vic;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProbabilityOfRedBallsTest {

    @Test
    public void whichBallIsFirstEmpty() {
        int whichBall = 0;

        for(int i = 0; i < 20; i++){
            ProbabilityOfRedBalls probability = new ProbabilityOfRedBalls();
            whichBall = whichBall + probability.whichBallIsFirstEmpty();
        }

        if(whichBall == 0){
            Assert.assertEquals(0,whichBall);
        }else{
            Assert.assertEquals(1,whichBall);
        }
    }
}