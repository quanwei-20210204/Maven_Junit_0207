package org.vic;

import java.util.*;

//task 2-2: rewrite the task, divide the task into two parts, one is the logic, main method for present;
public class HelloSAP {
    private Collection<String> collection = new ArrayList<String>();


    //Comments from Vic: main method for View -- the input and output, and present
    public static void main(String[] args){

    }

    // Method name: countOff
    public void countOff(){
        for (int i = 1; i <= 6; i++){
            if(i % 3 == 0){
                collection.add("fizz");
            }else {
                collection.add(Integer.toString(i));
            }
        }
    }

    //show the result in List
    public void showResult(){
        for(String s:collection){
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

}

