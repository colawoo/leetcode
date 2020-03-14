package twoSum;

import org.junit.Assert;
import org.junit.Test;

public class TestTwoSum {

    @Test
    public void testTwoSum() {
        TwoSum twoSum = new TwoSum();
        int[] sum = twoSum.twoSum(new int[]{2, 7, 11, 15}, 9);
        Assert.assertEquals(0, sum[0]);
        Assert.assertEquals(1, sum[1]);
    }

}
