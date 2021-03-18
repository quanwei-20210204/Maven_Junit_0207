package org.vic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GameNumberOff {
    public static final String FIZZ = "fizz";
    public static final String BUZZ = "buzz";

    // Method name: countOff
    public List<String> countOff(int topLimited, int playerNum){
        TakeAnswer takeAnswer = new TakeAnswer();
        Random random = new Random();  //create a Random object
        int myPosition = random.nextInt(playerNum)+1;  //generate a random Integer for my position
        PrintAnswers.showMyPosition(myPosition);

        List<String> outcome = new ArrayList<>(topLimited);

        try {
               for (int i = 1; i <= topLimited; i++) {

                   if(i % playerNum == myPosition){
                        if (!takeAnswer.answer().equals(vary(i))){
                            outcome.add("wrong");
                            PrintAnswers.showCurrentResult("wrong");
                            return outcome;
                        }
                    }

               outcome.add(vary(i));
               PrintAnswers.showCurrentResult(vary(i));
            }

        } catch(Exception e){
            PrintAnswers.showExceptionMessage(e,"countOff()");
        }

        return outcome;
    }

    String vary(int i){

        if(isDivisible(i,3)  && isDivisible(i,5)) {
            return FIZZ+BUZZ;
        }else if(isDivisible(i,3)){
            return FIZZ;
        }else if(isDivisible(i,5)){
            return BUZZ;
        }else{
            return Integer.toString(i);
        }

    }

    //check if the dividend can be divided by divisor
    boolean isDivisible(int dividend,int divisor){
       /*if(dividend % divisor == 0){
            return true;
        }else{
            return false;
        }*/

        return dividend % divisor == 0;  //compliler suggests
    }
}
