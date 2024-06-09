package rs.ac.singidunum;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {


    // Greska u metodi testAdd(). Fja dodaje +1 umesto prosledjeni argument
    @Test
    public void testAdd(){
        int a = 4;
        int b = 2;
        int expected = 6;
        int actual = Calculator.add(a,b);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testAdd2(){
        Assert.assertEquals(6,Calculator.add(4,2));
    }

    @Test
    public void testSub(){
        int a = 4;
        int b = 2;
        int expected = 2;
        int actual = Calculator.sub(a,b);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDiv(){
        double a = 10.0;
        double b = 5.0;
        double expected = 2.0;
        double delta = 0.0;
        double actual = Calculator.div(a,b);
        Assert.assertEquals(expected, actual, delta);
    }


    @Test(expected = ArithmeticException.class)
    public void testDiv0(){
        double a = 10.0;
        double b = 0.0;
        Calculator.div(a,b);
    }

    @Ignore
    @Test
    public void multiplyTest(){
        int a = 12;
        int b = 4;
        int expected = 48;
        int actual = Calculator.multiply(a,b);
        Assert.assertEquals(expected, actual);
    }



}
