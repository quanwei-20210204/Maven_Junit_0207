package org.vic;

import java.util.*;

//task 2-2: rewrite the task, divide the task into two parts, one is the logic, main method for present;
public class HelloSAP {
    public static final String FIZZ = "fizz";

    //Comments from Vic: main method for View -- the input and output, and present
    public static void main(String[] args){

        HelloSAP hSAP = new HelloSAP();
        hSAP.countOff();

    }

    // Method name: countOff
    public void countOff(){
        List<String>  outcome = new ArrayList<>(100);

        for (int i = 1; i <= 100; i++){

            outcome.add(vary(i));

        }

        for(String s: outcome){
            System.out.println(s);
        }

    }

    String vary(int i){
        if(i % 3 == 0){
            return FIZZ;
        }else{
            return Integer.toString(i);
        }
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

