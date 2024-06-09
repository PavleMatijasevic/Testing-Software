package rs.ac.singidunum;

import org.junit.Assert;
import org.junit.Test;

public class TheatreTest {


    @Test(expected = IllegalArgumentException.class)
    public void testCalculateDiscountIEC1(){
    int numTickets = -2;
    Theatre.calculateDiscount(numTickets);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateDiscountIEC2(){
        int numTickets = 500;
        Theatre.calculateDiscount(numTickets);
    }

    @Test
    public void testCalculateDiscountLC1(){
        int numTickets = 2;
        int expected = 0;
        int actual = Theatre.calculateDiscount(numTickets);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testCalculateDiscountLC2(){
        int numTickets = 7;
        int expected = 5;
        int actual = Theatre.calculateDiscount(numTickets);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testCalculateDiscountLC3(){
        int numTickets = 16;
        int expected = 10;
        int actual = Theatre.calculateDiscount(numTickets);
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateDiscountBV1(){
        int numTickets = -1;
        Theatre.calculateDiscount(numTickets);
    }

    // Nula nije uvrstena u uslov a treba da bude
    @Test(expected = IllegalArgumentException.class)
    public void testCalculateDiscountBV2(){
        int numTickets = 0;
        Theatre.calculateDiscount(numTickets);
    }

    @Test
    public void testCalculateDiscountBV3(){
        int numTickets = 1;
        int expected = 0;
        int actual = Theatre.calculateDiscount(numTickets);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testCalculateDiscountBV4(){
        int numTickets = 4;
        int expected = 0;
        int actual = Theatre.calculateDiscount(numTickets);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testCalculateDiscountBV5(){
        int numTickets = 5;
        int expected = 0;
        int actual = Theatre.calculateDiscount(numTickets);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCalculateDiscountBV6(){
        int numTickets = 6;
        int expected = 5;
        int actual = Theatre.calculateDiscount(numTickets);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCalculateDiscountBV7(){
        int numTickets = 9;
        int expected = 5;
        int actual = Theatre.calculateDiscount(numTickets);
        Assert.assertEquals(expected, actual);
    }


    // Treba da uvrsti i vrednost 10
    @Test
    public void testCalculateDiscountBV8(){
        int numTickets = 10;
        int expected = 5;
        int actual = Theatre.calculateDiscount(numTickets);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testCalculateDiscountBV9(){
        int numTickets = 11;
        int expected = 10;
        int actual = Theatre.calculateDiscount(numTickets);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCalculateDiscountBV10(){
        int numTickets = 249;
        int expected = 10;
        int actual = Theatre.calculateDiscount(numTickets);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testCalculateDiscountBV11(){
        int numTickets = 250;
        int expected = 10;
        int actual = Theatre.calculateDiscount(numTickets);
        Assert.assertEquals(expected, actual);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testCalculateDiscountBV12(){
        int numTickets = 251;
        Theatre.calculateDiscount(numTickets);

    }







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
