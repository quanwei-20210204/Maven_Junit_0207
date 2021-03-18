package org.vic;

import java.util.*;

//task 2-4: in main method, receive the argument
public class HelloSAP {

    //Comments from Vic: main method for View -- the input and output, and present
    public static void main(String[] args){

        try {
            GameNumberOff gameNumberOff = new GameNumberOff();
            ActualValue actualValue = new ActualValue(args);
            List<String> result = gameNumberOff.countOff(actualValue.getTopLimited(),8);
        }catch (Exception e){
            System.out.println(e.getMessage()+"main()");
        }

    }

}

