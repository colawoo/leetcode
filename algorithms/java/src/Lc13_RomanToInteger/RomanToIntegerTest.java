package Lc13_RomanToInteger;

import org.junit.Assert;
import org.junit.Test;

public class RomanToIntegerTest {

    @Test
    public void testRomanToInt() {
        RomanToInteger romanToInteger = new RomanToInteger();
        int result1 = romanToInteger.romanToInt("III");
        Assert.assertEquals(3, result1);
        int result2 = romanToInteger.romanToInt("LVIII");
        Assert.assertEquals(58, result2);
        int result3 = romanToInteger.romanToInt("MCMXCIV");
        Assert.assertEquals(1994, result3);
    }
}
