package org.vic;

import java.util.Random;

public class ProbabilityOfRedBalls {
    Random random = new Random();

    private final int RED = 0;
    private final int WHITE = 1;
    private final int BLUE= 2;
    private int redBalls = 30;
    private int whiteBalls = 50;
    private int blueBalls = 120;

    int whichBallIsFirstEmpty(){
        for(int i=0; i<=200; i++){
            getABallOut();
            if(redBallsEmpty()){
                return RED;
            }else if(whiteBallsEmpty() || blueBallsEmpty()){
                return WHITE;
            }
        }
        return WHITE;
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

    public void getABallOut(){
        int selectedBall = random.nextInt(3);

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
