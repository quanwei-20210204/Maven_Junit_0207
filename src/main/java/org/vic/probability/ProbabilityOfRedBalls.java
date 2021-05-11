package org.vic.probability;

import com.sun.org.apache.regexp.internal.RE;

import java.text.DecimalFormat;
import java.util.*;

public class ProbabilityOfRedBalls {
    private final int RED = 0;
    private final int WHITE = 1;
    private final int BLUE= 2;
    private final int REDNUM = 30;
    private final int WHITENUM = 30;
    private final int BLUENUM = 30;

    List<Integer> mixBallsBox(){

        List<Integer> ballsBox = new ArrayList<>();
        for(int i = 0; i < REDNUM; i++){
            ballsBox.add(RED);
        }
        for(int i = 0; i < WHITENUM; i++){
            ballsBox.add(WHITE);
        }
        for(int i = 0; i < BLUENUM; i++){
            ballsBox.add(BLUE);
        }

        Collections.shuffle(ballsBox);
        return ballsBox;

    }

    int whichBallIsFirstEmpty(List<Integer> ballsBox,int redNum, int whiteNum, int blueNum){
        int redBalls = redNum;
        int whiteBalls = whiteNum;
        int blueBalls = blueNum;

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

            if(redBalls == 0){
                return RED;
            }else if(whiteBalls == 0 ){
                return WHITE;
            }else if( blueBalls == 0){
                return WHITE;
            }
        }
        return WHITE;
    }

    float probabilityOfOneMillionTimes(int redNum, int whiteNum, int blueNum){
        int redTimes = 0;
        for(int i = 0; i < 1000000; i++){
            if(whichBallIsFirstEmpty(mixBallsBox(),redNum,whiteNum,blueNum) == RED){
                redTimes++;
            }
        }
        System.out.println(redTimes);
        return calculateProbability(redTimes,1000000);
    }

    float calculateProbability(int times, int totolTimes){
        DecimalFormat df = new DecimalFormat("0.000");
        String probability = df.format((float)times/totolTimes);
        return Float.parseFloat(probability);
    }

}
