package org.vic;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

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