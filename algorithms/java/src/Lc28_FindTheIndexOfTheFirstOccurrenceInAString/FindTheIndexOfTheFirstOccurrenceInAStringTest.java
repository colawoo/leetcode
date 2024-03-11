package Lc28_FindTheIndexOfTheFirstOccurrenceInAString;

import org.junit.Assert;
import org.junit.Test;

public class FindTheIndexOfTheFirstOccurrenceInAStringTest {

    @Test
    public void testSolution1() {
        FindTheIndexOfTheFirstOccurrenceInAString f = new FindTheIndexOfTheFirstOccurrenceInAString();
        int ans1 = f.solution1("ssadbutsad", "sad");
        Assert.assertEquals(1, ans1);
        int ans2 = f.solution1("adbutsad", "sad");
        Assert.assertEquals(5, ans2);
        int ans3 = f.solution1("leetcode", "leeto");
        Assert.assertEquals(-1, ans3);
        int ans4 = f.solution1("mississippi", "issip");
        Assert.assertEquals(4, ans4);
    }

    @Test
    public void testSolution2() {
        FindTheIndexOfTheFirstOccurrenceInAString f = new FindTheIndexOfTheFirstOccurrenceInAString();
        int ans1 = f.solution2("ssadbutsad", "sad");
        Assert.assertEquals(1, ans1);
        int ans2 = f.solution2("adbutsad", "sad");
        Assert.assertEquals(5, ans2);
        int ans3 = f.solution2("leetcode", "leeto");
        Assert.assertEquals(-1, ans3);
        int ans4 = f.solution1("mississippi", "issip");
        Assert.assertEquals(4, ans4);
    }

    @Test
    public void testGetNext() {
        FindTheIndexOfTheFirstOccurrenceInAString f = new FindTheIndexOfTheFirstOccurrenceInAString();
        int[] next = f.getNext("aabaaf");
        Assert.assertEquals("010120", printNext(next));
    }

    private String printNext(int[] next) {
        String ans = "";
        for (int i = 0; i < next.length; i++) {
            ans += next[i];
        }
        return ans;
    }
}
