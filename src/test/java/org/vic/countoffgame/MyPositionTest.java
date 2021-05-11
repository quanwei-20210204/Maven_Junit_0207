package org.vic.countoffgame;

import junit.framework.Assert;
import org.junit.Test;
import org.vic.countoffgame.MyPosition;
import org.vic.countoffgame.PrintAnswers;

public class MyPositionTest {

    @Test
    public void getMyPosition() {
    }

    @Test
    public void myPositionTest(){
        PrintAnswers printAnswers = new PrintAnswers();
        MyPosition myPlace = new MyPosition(8,printAnswers);

        Assert.assertEquals(true,myPlace.getMyPosition() <= 8 && myPlace.getMyPosition() > 0);
    }
}