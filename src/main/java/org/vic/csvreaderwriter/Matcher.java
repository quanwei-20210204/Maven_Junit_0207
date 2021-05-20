package org.vic.csvreaderwriter;

import java.util.Random;

public class Matcher {
    private int timesForTest = 0; //only for PseudoCode

    public boolean isMatchedAccurate(String source, String keyword){

        return source.indexOf(keyword) != -1;

    }

    public boolean isMatchedStartWith(String source, String keyword){

        return source.startsWith(keyword);

    }

    public boolean isMatchedOnCol(String source, String keyword, int colNum){
        String[] buff = source.split(",");
        return buff[colNum].startsWith(keyword) || buff[colNum].endsWith(keyword);
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
