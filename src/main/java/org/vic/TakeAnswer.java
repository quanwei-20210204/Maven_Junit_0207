package org.vic;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class TakeAnswer {
    private Scanner scanner = new Scanner(System.in);

    public void setIn(ByteArrayInputStream baIn) {
        this.scanner = new Scanner(baIn);
    }

    public String answer(){
        System.out.println("Please input your answer:");
        //Scanner scanner = new Scanner(System.in);
        String myAnswer = scanner.nextLine();
        return myAnswer;

    }
}
