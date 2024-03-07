package test;

import org.junit.Assert;
import org.junit.Test;
import solution.LengthOfLastWord;

public class LengthOfLastWordTest {

    @Test
    public void testLengthOfLastWord() {
        LengthOfLastWord l = new LengthOfLastWord();
        int ans1 = l.lengthOfLastWord("Hello World");
        Assert.assertEquals(5, ans1);
        int ans2 = l.lengthOfLastWord("   fly me   to   the moon  ");
        Assert.assertEquals(4, ans2);
        int ans3 = l.lengthOfLastWord("luffy is still joyboy");
        Assert.assertEquals(6, ans3);
    }
}
