package Lc88_MergeSortedArray;

import org.junit.Assert;
import org.junit.Test;

public class MergeSortedArrayTest {


    @Test
    public void testMerge() {

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        int m = 3;
        int n = 3;

        MergeSortedArray mer = new MergeSortedArray();
        mer.mergeM1(nums1, m, nums2, n);

        Assert.assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
    }

}
