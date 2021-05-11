package org.vic.countoffgame;

//get the actual argument for countOff()
public class ActualValue {
    public static final int DEFAULTNUM = 100;
    private int topLimited = DEFAULTNUM;
    private int playerNumber = 8;

    public ActualValue(String[] inputValues){
        analyze(inputValues);
    }

    public int getTopLimited() {
        return topLimited;
    }

    public int getPlayerNumber(){
        return playerNumber;
    }

    private void analyze(String[] inputValues){
        if(inputValues.length == 0){
            return;
        }else{
            topLimited = Integer.parseInt(inputValues[0]);
            playerNumber = Integer.parseInt(inputValues[1]);
        }

    }
}
