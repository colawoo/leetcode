package removeDuplicatesFromSortedArray;

import org.junit.Assert;
import org.junit.Test;

public class TestRemoveDuplicatesFromSortedArray {

    @Test
    public void testRemoveDuplicatesFromSortedArray() {

        int[] nums = {1, 1, 2};
        RemoveDuplicatesFromSortedArray r = new RemoveDuplicatesFromSortedArray();
        int len = r.removeDuplicatesFromSortedArray(nums);
        Assert.assertEquals(2, len);
        Assert.assertEquals(1, nums[0]);
        Assert.assertEquals(2, nums[1]);

    }

    @Test
    public void testRemoveDuplicatesFromSortedArray1() {

        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        RemoveDuplicatesFromSortedArray r = new RemoveDuplicatesFromSortedArray();
        int len = r.removeDuplicatesFromSortedArray(nums);
        Assert.assertEquals(5, len);
        Assert.assertEquals(0, nums[0]);
        Assert.assertEquals(1, nums[1]);
        Assert.assertEquals(2, nums[2]);
        Assert.assertEquals(3, nums[3]);
        Assert.assertEquals(4, nums[4]);

    }

}
