package org.vic;

import java.util.*;

//task 2-4: in main method, receive the argument
public class HelloSAP {
    public static final int PLAYERNUM = 8;

    //Comments from Vic: main method for View -- the input and output, and present
    public static void main(String[] args){

        try {

            ActualValue actualValue = new ActualValue(args);
            TakeAnswer takeAnswer = new TakeAnswer();
            PrintAnswers printAnswers = new PrintAnswers();
            GameNumberOff gameNumberOff = new GameNumberOff(printAnswers,takeAnswer);

            gameNumberOff.countOff(actualValue.getTopLimited(),PLAYERNUM);

        }catch (Exception e){
            System.out.println(e.getMessage()+"main()");
        }

    }

}

