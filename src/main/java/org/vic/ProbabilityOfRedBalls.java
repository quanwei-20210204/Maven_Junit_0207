package org.vic;

import com.sun.org.apache.regexp.internal.RE;

import java.text.DecimalFormat;
import java.util.*;

public class ProbabilityOfRedBalls {
    Random random = new Random();

    private final int RED = 0;
    private final int WHITE = 1;
    private final int BLUE= 2;
    private int redBalls = 30;
    private int whiteBalls = 50;
    private int blueBalls = 120;

    float probabilityOfOneMillionTimes(){
        int redTimes = 0;
        for(int i = 0; i < 1000000; i++){
            if(whichBallIsFirstEmpty() == RED){
                redTimes++;
            }
        }
        DecimalFormat df = new DecimalFormat("0.000");
        String probability = df.format((float)redTimes/1000000);
        return Float.parseFloat(probability);
    }

    int whichBallIsFirstEmpty(){

        List<Integer> ballsList = mixBallsBox();

        for(int i=0; i<200; i++){
            getABallOut(ballsList);
            if(redBallsEmpty()){
                resetBallsNumber();
                return RED;
            }else if(whiteBallsEmpty() || blueBallsEmpty()){
                resetBallsNumber();
                return WHITE;
            }
        }
        return WHITE;
    }

    List<Integer> mixBallsBox(){

        List<Integer> ballsBox = new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
                2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,
                2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,
                2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2));

        Collections.shuffle(ballsBox);
        return ballsBox;

    }

    boolean whiteBallsEmpty(){
        if(whiteBalls > 0){
            return false;
        }else{
            return true;
        }
    }

    boolean blueBallsEmpty(){
        if(blueBalls > 0){
            return false;
        }else{
            return true;
        }
    }

    boolean redBallsEmpty(){
        if(redBalls > 0){
            return false;
        }else{
            return true;
        }
    }


    public void getABallOut(List<Integer> ballsBox){
        int selectedBall =  ballsBox.remove(0); //random.nextInt(3);

        switch(selectedBall){
            case RED:redBalls--;
                break;
            case WHITE:whiteBalls--;
                break;
            case BLUE:blueBalls--;
                break;
        }
    }

    public void resetBallsNumber(){
        redBalls = 30;
        whiteBalls = 50;
        blueBalls = 120;
    }

}
