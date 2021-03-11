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
}
