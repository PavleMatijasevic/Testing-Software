package rs.ac.singidunum;

import org.junit.Assert;
import org.junit.Test;

public class TheatreTest {


    @Test
    public void testGetPriceA(){
        char input = 'a';
        double expected = 1000;
        double actual = Theatre.getPrice(input);
        Assert.assertEquals(expected,actual,0.0);
    }
    @Test
    public void testGetPriceB(){
        char input = 'b';
        double expected = 700;
        double actual = Theatre.getPrice(input);
        Assert.assertEquals(expected,actual,0.0);
    }

    @Test
    public void testGetPriceC(){
        char input = 'c';
        double expected = 500;
        double actual = Theatre.getPrice(input);
        Assert.assertEquals(expected,actual,0.0);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testGetPriceIC(){
        char input = 'g';
        Theatre.getPrice(input);
    }

    @Test
    public void checkCouponValidity(){
        String input = "ABCDEFGHIJ";
        boolean expected = true;
        boolean actual = Theatre.checkCoupon(input);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void checkCouponInvalidShort(){
        String input = "ABC";
        boolean expected = false;
        boolean actual = Theatre.checkCoupon(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkCouponInvalidLong(){
        String input = "ABCDEFGHIJKLOMOP";
        boolean expected = false;
        boolean actual = Theatre.checkCoupon(input);
        Assert.assertEquals(expected, actual);
    }





}
