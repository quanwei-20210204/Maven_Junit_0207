package org.vic;

import java.util.*;

public class HelloSAP {
    private Collection<String> collection = new ArrayList<String>();

    public static void main(String[] args){

        HelloSAP hsap = new HelloSAP();
        hsap.hello_world(10,7);

    }

    public  Collection<String> hello_world(){
        return hello_world(100,9);
    }

    public Collection<String> hello_world(int number,int players){ //return value will be the result;
        //task 2-2, print number from 1 to 100, when meet 3 and 3*n, print "fizz", 5 and 5*n, print "buzz"
        //task 2-4, one parameter for hello_world(), means the top value for the times we print;  check the parameter
        if(number < 0) {
            throw new ArithmeticException("the number should be positive.");
        }

        //task 2-6 receive the second parameter for the number of players, my position is random
        Random random = new Random();
        int myposition = random.nextInt(players)+1;
        System.out.println(myposition);

        for (int i = 1; i <= number; i++){

            //task 2-5: command line prompt:
           /* System.out.println("please input your answer:");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();

            //task 2-5: if input is right, the game moves on, or the game ends.
            if(input.equals(Integer.toString(i))){
                System.out.println("right, move on");
            }else{
                System.out.println("wrong answer");
                return null;
            }*/

            if(i % 3 == 0) {
                collection.add("fizz");
                //System.out.println("fizz");
            } else if(i % 5 == 0) {
                collection.add("buzz");
                //System.out.println("buzz");
            } else{
                collection.add(Integer.toString(i));
                //System.out.println(i);
            }

        }

        /*for(String i: collection){
            System.out.println(i);
        }*/

        return collection;
        //System.out.println("Hello World!");
        //System.out.println(new Date());
    }

    public Collection<String> getCollection(){
        return collection;
    }

    public void setCollection(String variable){
        collection.add(variable);
    }

}

