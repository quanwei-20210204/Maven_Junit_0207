package org.vic;

import java.util.*;

//task 2-4: in main method, receive the argument
public class HelloSAP {


    public static void main(String[] args){
        ProbabilityOfRedBalls probability = new ProbabilityOfRedBalls();
        float pro = probability.probabilityOfOneMillionTimes(30,50,120);
        System.out.println("The probability is: " + pro);
    }

    //Comments from Vic: main method for View -- the input and output, and present
    public static void main_for_NumberOffGame(String[] args){

        try {

            ActualValue actualValue = new ActualValue(args);
            TakeAnswer takeAnswer = new TakeAnswer();
            PrintAnswers printAnswers = new PrintAnswers();
            GameNumberOff gameNumberOff = new GameNumberOff(printAnswers,takeAnswer);

            gameNumberOff.countOff(actualValue.getTopLimited(),actualValue.getPlayerNumber());

        }catch (NumberFormatException e){
            System.out.println("Wrong format: number needed.");
        }

    }

}

