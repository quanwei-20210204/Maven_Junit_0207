package org.vic;

import java.util.*;

//task 2-4: in main method, receive the argument
public class HelloSAP {
    public static final int TOPLIMITED = 100;

    //Comments from Vic: main method for View -- the input and output, and present
    public static void main(String[] args){
        try {
            GameNumberOff gameNumberOff = new GameNumberOff();
            ActualValue actualValue = new ActualValue(args);
            List<String> result = gameNumberOff.countOff(actualValue.getTopLimited());
            printResult(result);
        }catch (Exception e){
            System.out.println(e.getMessage()+"main()");
        }

    }

    public static void printResult(List<String> result){
        for(String s: result){
            System.out.println(s);
        }
    }

}

