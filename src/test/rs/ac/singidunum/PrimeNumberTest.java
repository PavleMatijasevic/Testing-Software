package rs.ac.singidunum;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class PrimeNumberTest {

    private Integer inputNumber;
    private Boolean expectedResult;
    private PrimeNumbers checkPrimeNumbers;


    @Before
    public void initalize(){
        checkPrimeNumbers = new PrimeNumbers();
    }

    public PrimeNumberTest(Integer input, Boolean expected){
        this.inputNumber = input;
        this.expectedResult = expected;
    }


    @Parameterized.Parameters
    public static Collection primeNumbers(){
        return Arrays.asList(new Object[][]{
                {2, true},
                {3, true},
                {16, false},
                {25, false},
                {29, true},
                {13, false}
        });
    }

    @Test
    public void testValidatePrime(){
        System.out.println("Test je pozvan sa: "+inputNumber);
        Assert.assertEquals(expectedResult, checkPrimeNumbers.validate(inputNumber));
    }


}
