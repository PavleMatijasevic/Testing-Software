package rs.ac.singidunum;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class StringConcatenationTest {

    private String a;
    private String b;
    private Integer expected;
    private StringConcatenation stringConcatenation;




    @Before
    public void initalize(){
        stringConcatenation = new StringConcatenation();
    }

    public StringConcatenationTest(String a, String b, int expected){
        this.a = a;
        this.b = b;
        this.expected = expected;

    }


    @Parameterized.Parameters
    public static Collection stringConcatenation(){
        return Arrays.asList(new Object[][]{
                {"Hello", "world", 10},
                {"Paja","Mina", 8},
                {"ji", "hi", 4}
        });
    }


    @Test
    public void testConcatenate(){
        System.out.println("Test je pozvan sa: " +a +" i " + b );
        Assert.assertEquals(expected, stringConcatenation.concatenate(a,b));
    }




}
