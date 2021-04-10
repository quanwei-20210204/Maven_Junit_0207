package org.vic;

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

    void probabilityOfOneMillionTimes(){
        int redTimes = 0;
        for(int i = 0; i < 20; i++){
            whichBallIsFirstEmpty();
        }
        System.out.print(redTimes);
        //double probability = redTimes / 10000;
        //DecimalFormat df = new DecimalFormat("0.000");
        //System.out.print(df.format(probability));
    }

    int whichBallIsFirstEmpty(){

        List<Integer> ballsList = mixBallsBox();

        for(int i=0; i<200; i++){
            getABallOut(ballsList);
            //System.out.print("@"+redBalls+"  ,"+whiteBalls+"  ,"+ blueBalls+" ");
            if(redBallsEmpty()){
                return RED;
            }else if(whiteBallsEmpty() || blueBallsEmpty()){
                return WHITE;
            }
        }
        return WHITE;
    }

    List<Integer> mixBallsBox(){

        List<Integer> ballsBox = new ArrayList<>(200);
        for(int i = 0; i < redBalls; i++){
            ballsBox.add(RED);
        }
        for(int i = 0; i < whiteBalls; i++){
            ballsBox.add(WHITE);
        }
        for(int i = 0; i < blueBalls; i++){
            ballsBox.add(BLUE);
        }

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
        //System.out.print(selectedBall);

        switch(selectedBall){
            case 0:redBalls--;
                break;
            case 1:whiteBalls--;
                break;
            case 2:blueBalls--;
                break;
        }
        //return selectedBall;
    }

}
