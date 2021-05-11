package org.vic.countoffgame;

import java.util.Scanner;

public class TakeAnswer {
    private Scanner scanner = new Scanner(System.in);

    public String answer(){
        System.out.println("Please input your answer:");
        String myAnswer = scanner.nextLine();
        return myAnswer;

    }
}
