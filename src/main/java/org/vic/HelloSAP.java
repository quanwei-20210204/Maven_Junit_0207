package org.vic;

import java.util.*;

public class HelloSAP {
    private Collection<String> collection = new ArrayList<String>();

    public static void main(String[] args){

        HelloSAP hsap = new HelloSAP();
        hsap.hello_world();

    }

    public Collection<String> hello_world(){ //return value will be the result;
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

