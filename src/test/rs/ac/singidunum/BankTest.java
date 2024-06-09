package rs.ac.singidunum;

import org.junit.Assert;
import org.junit.Test;

public class BankTest {
    // klase ekvivalencije
    // IEC - illegal equivalence class

    @Test(expected = IllegalArgumentException.class)
    public void testGetInterestRateIEC1(){
        double amount = -5.0;
        Bank.getInterestRate(amount);
    }

    @Test
    public void testGetInterestRateLC1(){
        double amount = 50;
        double expected = 3.0;
        double delta = 0.0;
        double actual = Bank.getInterestRate(amount);
        Assert.assertEquals(expected, actual, delta);

    }
    @Test
    public void testGetInterestRateLC2(){
        double amount = 150;
        double expected = 5.0;
        double actual = Bank.getInterestRate(amount);
        double delta = 0.0;
        Assert.assertEquals(expected, actual, delta);

    }
    @Test
    public void testGetInterestRateLC3(){
        double amount = 1200;
        double expected = 7.0;
        double actual = Bank.getInterestRate(amount);
        double delta = 0.0;
        Assert.assertEquals(expected, actual, delta);
    }


    @Test(expected = IllegalArgumentException.class)
    public void testGetInterestRateBV1(){
        double amount = -0.01;
        Bank.getInterestRate(amount);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetInterestRateBV2(){
        double amount = 0;
        Bank.getInterestRate(amount);
    }
    @Test
    public void testGetInterestRateBV3(){
        double amount = 0.01;
        double expected = 3.0;
        double actual = Bank.getInterestRate(amount);
        double delta = 0.0;
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testGetInterestRateBV4(){
        double amount = 99.99;
        double expected = 3;
        double actual = Bank.getInterestRate(amount);
        double delta = 0.0;
        Assert.assertEquals(expected, actual, delta);
    }
    @Test
    public void testGetInterestRateBV5(){
        double amount = 100;
        double expected = 3;
        double actual = Bank.getInterestRate(amount);
        double delta = 0.0;
        Assert.assertEquals(expected, actual, delta);
    }


    @Test
    public void testGetInterestRateBV6(){
        double amount = 100.01;
        double expected = 5;
        double actual = Bank.getInterestRate(amount);
        double delta = 0.0;
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testGetInterestRateBV7(){
        double amount = 999.99;
        double expected = 5;
        double actual = Bank.getInterestRate(amount);
        double delta = 0.0;
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void testGetInterestRateBV8(){
        double amount = 1000;
        double expected = 5;
        double actual = Bank.getInterestRate(amount);
        double delta = 0.0;
        Assert.assertEquals(expected, actual, delta);
    }
    @Test
    public void testGetInterestRateBV9(){
        double amount = 1000.01;
        double expected = 7;
        double actual = Bank.getInterestRate(amount);
        double delta = 0.0;
        Assert.assertEquals(expected, actual, delta);
    }



}
