package maximumSubarray;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximumSubarray {


    @Test
    public void testMaxSubArray() {

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
//        int[] nums = {1,2};
        MaximumSubarray m = new MaximumSubarray();
        int sum = m.maxSubArrayM3(nums);
        Assert.assertEquals(6, sum);
    }


}
