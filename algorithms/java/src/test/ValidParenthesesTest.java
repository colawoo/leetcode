package test;

import org.junit.Assert;
import org.junit.Test;
import solution.ValidParentheses;

public class ValidParenthesesTest {

    @Test
    public void test() {
        ValidParentheses validParentheses = new ValidParentheses();
        boolean result1 = validParentheses.isValid("()");
        Assert.assertEquals(true, result1);
        boolean result2 = validParentheses.isValid("()[]{}");
        Assert.assertEquals(true, result2);
        boolean result3 = validParentheses.isValid("(]");
        Assert.assertEquals(false, result3);
        boolean result4 = validParentheses.isValid("()[]{}(");
        Assert.assertEquals(false, result4);
        boolean result5 = validParentheses.isValid("()[]{})");
        Assert.assertEquals(false, result5);
    }
}
