package test;

import org.junit.Assert;
import org.junit.Test;
import solution.PalindromeNumber;

public class PalindromeNumberTest {

    @Test
    public void testSolution1() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        boolean result1 = palindromeNumber.solution1(121);
        Assert.assertEquals(true, result1);
        boolean result2 = palindromeNumber.solution1(123);
        Assert.assertEquals(false, result2);
        boolean result3 = palindromeNumber.solution1(-121);
        Assert.assertEquals(false, result3);
    }

    @Test
    public void testSolution2() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        boolean result1 = palindromeNumber.solution2(121);
        Assert.assertEquals(true, result1);
        boolean result2 = palindromeNumber.solution2(123);
        Assert.assertEquals(false, result2);
        boolean result3 = palindromeNumber.solution2(-121);
        Assert.assertEquals(false, result3);
    }
}
