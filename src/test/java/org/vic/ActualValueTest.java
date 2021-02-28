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
    public void need_get_top_limit() {
        ActualValue actualValue = new ActualValue(new String[]{"50"});
        Assert.assertEquals(50,actualValue.getTopLimited());
    }

    @Test
    public void need_get_default_top_limit(){
        ActualValue actualValue = new ActualValue(new String[]{});
        Assert.assertEquals(100,actualValue.getTopLimited());
    }

    @Test
    public void need_get_top_limit_using_first_string(){
        ActualValue actualValue = new ActualValue(new String[]{"30","piano"});
        Assert.assertEquals(30,actualValue.getTopLimited());

    }
    @Test
    public void need_exception(){
        try{
            ActualValue actualValue = new ActualValue(new String[]{"piano"});
            fail("no exception");
        }catch (Exception e){
            Assert.assertTrue(e instanceof IllegalArgumentException);
        }
    }
}