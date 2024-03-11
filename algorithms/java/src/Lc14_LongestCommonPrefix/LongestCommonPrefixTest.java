package Lc14_LongestCommonPrefix;

import org.junit.Assert;
import org.junit.Test;

public class LongestCommonPrefixTest {

    @Test
    public void testSolution1() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] strs1 = {"flower", "flow", "flight"};
        String lcp1 = longestCommonPrefix.solution1(strs1);
        Assert.assertEquals("fl", lcp1);
        String[] strs2 = {"dog", "racecar", "car"};
        String lcp2 = longestCommonPrefix.solution1(strs2);
        Assert.assertEquals("", lcp2);
    }

    @Test
    public void testSolution2() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] strs1 = {"flower", "flow", "flight"};
        String lcp1 = longestCommonPrefix.solution2(strs1);
        Assert.assertEquals("fl", lcp1);
        String[] strs2 = {"dog", "racecar", "car"};
        String lcp2 = longestCommonPrefix.solution2(strs2);
        Assert.assertEquals("", lcp2);
    }
}
