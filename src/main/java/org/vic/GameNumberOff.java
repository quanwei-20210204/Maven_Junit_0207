package org.vic;

import java.util.ArrayList;
import java.util.List;

public class GameNumberOff {
    public static final String FIZZ = "fizz";
    public static final String BUZZ = "buzz";


    void showOutcome(List<String> outcome){
        for (String s:outcome){
            System.out.println(s);
        }
    }

    // Method name: countOff
    public List<String> countOff(int topLimited){
       List<String> outcome = new ArrayList<>(topLimited);

        try {
            playerNumCheck(topLimited);

            for (int i = 1; i <= topLimited; i++) {
                outcome.add(vary(i));
            }

        }
        catch(Exception e){
            System.out.println(e.getMessage()+"in countOff()");
        }
        return outcome;

    }

    //check the parameter of the countOff(), seems no need to write this method?
    public static void playerNumCheck(int players) throws Exception{
        if(players < 0){
            throw new Exception("Players need to be a positive number.");
        }
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
