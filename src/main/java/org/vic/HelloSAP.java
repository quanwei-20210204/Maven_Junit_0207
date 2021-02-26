package org.vic;

import java.util.*;

//task 2-2: rewrite the task, divide the task into two parts, one is the logic, main method for present;
public class HelloSAP {
    public static final String FIZZ = "fizz";
    public static final String BUZZ = "buzz";
    public static final int TOPLIMITED = 80;


    //Comments from Vic: main method for View -- the input and output, and present
    public static void main(String[] args){
        List<String> result;

        HelloSAP hSAP = new HelloSAP();
        result = hSAP.countOff(TOPLIMITED);

        hSAP.showOutcome(result);

    }

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

            /*for (String s : outcome) {
                System.out.println(s);
            }*/

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        return outcome;

    }

    //check the parameter of the countOff()
    void playerNumCheck(int players) throws Exception{
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
    /*  if(dividend % divisor == 0){
            return true;
        }else{
            return false;
        }*/

        return dividend % divisor == 0;  //compliler suggests
    }


/*
    //show the result in List
    public void showResult(){
        for(String s:){
            System.out.println(s);
        }
    }

    //show the list's size
    public void resultSize(){
        System.out.println(collection.size());
    }

    //show if the result contains some constant
    public boolean ifContains(String s){
        return collection.contains(s);
    }

    //Model or the logic is separated from View, in order to divide into two parts.
*/
}

