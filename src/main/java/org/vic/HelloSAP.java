package org.vic;

import java.util.*;

public class HelloSAP {
    static Collection<String> collection = new ArrayList<String>();

    public static void main(String[] args){
        Hello_world();
    }

    public static void Hello_world(){
        //task 2-2, print number from 1 to 100, when meet 3 and 3*n, print "fizz", 5 and 5*n, print "buzz"



        for (int i = 1; i <= 100; i++){

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

        for(String i: collection){
            System.out.println(i);
        }

        //System.out.println("Hello World!");
        //System.out.println(new Date());
    }
}

