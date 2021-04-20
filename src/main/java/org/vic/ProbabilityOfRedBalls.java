package org.vic;

import com.sun.org.apache.regexp.internal.RE;

import java.text.DecimalFormat;
import java.util.*;

public class ProbabilityOfRedBalls {
    Random random = new Random();

    private final int RED = 0;
    private final int WHITE = 1;
    private final int BLUE= 2;

    List<Integer> mixBallsBox(){

        List<Integer> ballsBox = new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
                2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,
                2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,
                2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2));

        Collections.shuffle(ballsBox);
        return ballsBox;

    }

    int whichBallIsFirstEmpty(List<Integer> ballsBox){
        int redBalls = 30;
        int whiteBalls = 50;
        int blueBalls = 120;

        int selectedBall;

        for(int i=0; i<200; i++){
            selectedBall =  ballsBox.remove(0);
            switch (selectedBall){
                case RED:
                    redBalls--;
                    break;
                case WHITE:
                    whiteBalls--;
                    break;
                case BLUE:
                    blueBalls--;
                    break;
            }
            if(redBalls==0){
                return RED;
            }else if(whiteBalls == 0 || blueBalls == 0){
                return WHITE;
            }
        }
        return WHITE;
    }

    float probabilityOfOneMillionTimes(){
        int redTimes = 0;
        for(int i = 0; i < 1000000; i++){
            if(whichBallIsFirstEmpty(mixBallsBox()) == RED){
                redTimes++;
            }
        }
        return calculateProbability(redTimes,1000000);
    }

    float calculateProbability(int times, int totolTimes){
        DecimalFormat df = new DecimalFormat("0.000");
        String probability = df.format((float)times/1000000);
        return Float.parseFloat(probability);
    }

}
