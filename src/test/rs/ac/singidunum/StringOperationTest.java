package rs.ac.singidunum;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class StringOperationTest {
    @Test
    public void testMultiplyString(){
        String s = "ABC";
        int n = 3;
        String expected = "ABCABCABC";
        String actual = StringOperations.multiplyString(s,n);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCountCharacter(){
        String a = "Hello world, welcome to the Software testing course!";
        int c = 'e';
        int expected = 7;
        int actual = StringOperations.CountCharacters(a,c);
        Assert.assertEquals(expected, actual);
    }


    @Ignore("Method not ready")
    @Test
    public void testReverseString(){
        String input = "Hello!";
        String expected = "!olleH";
        String actual = StringOperations.reverseString(input);
        Assert.assertEquals(expected, actual);





    }



}
