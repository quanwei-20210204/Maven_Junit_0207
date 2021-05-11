package org.vic.countoffgame;

import org.junit.*;
import org.junit.rules.ExpectedException;
import org.vic.countoffgame.ActualValue;

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
    @Test(expected = IllegalArgumentException.class)
    public void need_exception_via_expected_way(){
        ActualValue actualvalue = new ActualValue(new String[]{"piano"});

    }
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void need_exception_via_rule() throws IllegalArgumentException{
        thrown.expect(IllegalArgumentException.class);
        ActualValue actualvalue = new ActualValue(new String[]{"piano"});

    }


}