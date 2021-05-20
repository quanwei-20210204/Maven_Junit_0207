package org.vic.csvreaderwriter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatcherTest {

    @Test
    public void isMatchedAccurate() {
        Matcher matcher = new Matcher();
        boolean isMatched = matcher.isMatchedAccurate("zhang, quanwei", "uanwei");
        Assert.assertEquals(true, isMatched);
    }

    @Test
    public void isMatchedOnCol(){
        Matcher matcher = new Matcher();
        boolean isMatched = matcher.isMatchedOnCol("quanwei,hello,matched", "mat",2);
        Assert.assertEquals(true, isMatched);
    }

    @Test
    public void isMatchedStartwith() {

    }
}