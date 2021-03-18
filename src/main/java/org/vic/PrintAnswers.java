package org.vic;

import java.util.List;

public class PrintAnswers {
    public static void showOutcome(List<String> outcome){
        for (String s:outcome){
            System.out.println(s);
        }
    }

    public static void showCurrentResult(String result){
        System.out.println(result);
    }

    public static void showMyPosition(int myPosition){
        System.out.println("Your position is:" + myPosition);
    }

    public static void showExceptionMessage(Exception e,String methodName){
        System.out.println(e.getMessage()+" in " + methodName);
    }

    public static void printResult(List<String> result) {
        for (String s : result) {
            System.out.println(s);
        }
    }

    }
