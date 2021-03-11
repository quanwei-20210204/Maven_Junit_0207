package org.vic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameNumberOff {
    public static final String FIZZ = "fizz";
    public static final String BUZZ = "buzz";


    public String answer(){
        System.out.println("Please input your answer:");
        Scanner scanner = new Scanner(System.in);
        String myAnswer = scanner.nextLine();
        return myAnswer;

    }


    // Method name: countOff
    public List<String> countOff(int topLimited){

        List<String> outcome = null;
        try {
            outcome = new ArrayList<>(topLimited);

            for (int i = 1; i <= topLimited; i++) {

               if(i % 10 == 1){ //10 players, Suppose I'm the first one.
                    if (!answer().equals(vary(i))){
                        outcome.add("wrong");
                        return outcome;
                    }
                }

               outcome.add(vary(i));
               PrintAnswers.showCurrentResult(vary(i));
            }

        }
        catch(Exception e){
            System.out.println(e.getMessage()+"in countOff()");
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
