package org.vic.countoffgame;

import java.util.Random;

public class MyPosition {
    private PrintAnswers printAnswers;
    private int myPosition;

    public MyPosition(int playerNum, PrintAnswers printAnswers){

        this.printAnswers = printAnswers;
        Random random = new Random();  //create a Random object
        myPosition = random.nextInt(playerNum)+1;  //generate a random Integer for my position
        printAnswers.print("The player number is:" + playerNum);
        printAnswers.print("My position is: " + myPosition);

    }

    public int getMyPosition(){
        return myPosition;
    }

}
