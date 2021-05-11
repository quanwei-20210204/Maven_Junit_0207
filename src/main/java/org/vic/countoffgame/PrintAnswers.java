package org.vic.countoffgame;

import java.util.List;

public class PrintAnswers {

    public void print(String output){
        System.out.println(output);
    }

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


    public static void printResult(List<String> result) {
        for (String s : result) {
            System.out.println(s);
        }
    }

    }
