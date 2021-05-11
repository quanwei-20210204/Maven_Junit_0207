package org.vic.countoffgame;

import java.util.ArrayList;
import java.util.List;

public class GameNumberOff {
    public static final String FIZZ = "fizz";
    public static final String BUZZ = "buzz";
    public static final int FIZZ_NUMBER = 3;
    public static final int BUZZ_NUMBER = 5;
    private PrintAnswers printAnswers = new PrintAnswers();;
    private TakeAnswer takeAnswer = new TakeAnswer();
    List<String> outcome;

    // Method name: countOff
    public void countOff(int topLimited, int playerNum){
        MyPosition myPlace = new MyPosition(playerNum,printAnswers);

        outcome = new ArrayList<>(topLimited);

        for (int i = 1; i <= topLimited; i++) {
            outcome.add(vary(i));
            int myPosition = myPlace.getMyPosition();
            if(isMyTurn(i,playerNum,myPosition) && notRightAnswer(vary(i))){
                return;
            }
           printAnswers.print(vary(i));
        }

        return;
    }

    public  GameNumberOff(PrintAnswers printAnswers,TakeAnswer takeAnswer){
        this.printAnswers = printAnswers;
        this.takeAnswer = takeAnswer;
    }

    boolean isMyTurn(int i, int playerNum, int myPosition){
        if(playerNum == myPosition && i % playerNum == 0){
            return true;
        }else if(i % playerNum == myPosition){
            return true;
        }else{
            return false;
        }
    }

    boolean notRightAnswer(String right){
        String answer = takeAnswer.answer();
        if(!answer.equals(right)){
            printAnswers.print("Wrong, Game over. ");
            return true;
        }else{
            return false;
        }
    }

    String vary(int i){

        if(isDivisible(i,FIZZ_NUMBER)  && isDivisible(i,BUZZ_NUMBER)) {
            return FIZZ+BUZZ;
        }else if(isDivisible(i,FIZZ_NUMBER)){
            return FIZZ;
        }else if(isDivisible(i,BUZZ_NUMBER)){
            return BUZZ;
        }else{
            return Integer.toString(i);
        }

    }


    //check if the dividend can be divided by divisor
    boolean isDivisible(int dividend,int divisor){

        return dividend % divisor == 0;  //compliler suggests
    }
}
