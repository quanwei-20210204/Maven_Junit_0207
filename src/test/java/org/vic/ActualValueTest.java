package org.vic;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ActualValueTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getTopLimited() {
        ActualValue actualValue = new ActualValue(new String[]{"50"});
        Assert.assertEquals(50,actualValue.getTopLimited());
    }
}