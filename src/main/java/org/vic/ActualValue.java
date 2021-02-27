package org.vic;

//get the actual argument for countOff()
public class ActualValue {
    public static final int DEFAULTNUM = 100;
    private int topLimited = DEFAULTNUM;

    public ActualValue(String[] inputValues){
        analyze(inputValues);
    }

    public int getTopLimited() {
        return topLimited;
    }

    private void analyze(String[] inputValues){
        if(inputValues.length == 0){
            return;
        }else{
            topLimited = Integer.parseInt(inputValues[0]);
        }

    }
}
