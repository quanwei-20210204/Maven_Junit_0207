package org.vic.csvreaderwriter;

import java.util.Random;

public class Matcher {
    private int timesForTest = 0; //only for PseudoCode

    public boolean isMatched(){
        return true;
    }

    public boolean randomBoolean(){
        Random random = new Random();
        return random.nextBoolean();
    }

    public boolean matchOrNotPseudoCode(){
        if(timesForTest % 2 == 0){
            timesForTest++;
            return true;
        }else{
            timesForTest++;
            return false;
        }
    }


}
