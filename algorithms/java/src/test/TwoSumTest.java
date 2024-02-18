package test;

import org.junit.Assert;
import org.junit.Test;
import solution.TwoSum;

public class TwoSumTest {

    @Test
    public void testTwoSum() {
        TwoSum twoSum = new TwoSum();
        int[] sum = twoSum.twoSumV2(new int[]{2, 7, 11, 15}, 9);
        Assert.assertEquals(0, sum[0]);
        Assert.assertEquals(1, sum[1]);
    }

}
