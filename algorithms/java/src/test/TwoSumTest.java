package test;

import org.junit.Assert;
import org.junit.Test;
import solution.TwoSum;

public class TwoSumTest {

    @Test
    public void testSolution1() {
        TwoSum twoSum = new TwoSum();
        int[] result1 = twoSum.solution1(new int[]{2, 7, 11, 15}, 9);
        Assert.assertEquals(2, result1.length);
        Assert.assertEquals(0, result1[0]);
        Assert.assertEquals(1, result1[1]);
    }

    @Test
    public void testSolution2() {
        TwoSum twoSum = new TwoSum();
        int[] result2 = twoSum.solution2(new int[]{3, 2, 4}, 6);
        Assert.assertEquals(2, result2.length);
        Assert.assertEquals(0, result2[0]);
        Assert.assertEquals(1, result2[1]);
    }

    @Test
    public void testSolution3() {
        TwoSum twoSum = new TwoSum();
        int[] result3 = twoSum.solution3(new int[]{3, 3}, 6);
        Assert.assertEquals(2, result3.length);
        Assert.assertEquals(1, result3[0]);
        Assert.assertEquals(2, result3[1]);
    }
}
