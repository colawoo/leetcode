package mergeSortedArray;

import java.util.Arrays;

/**
 * 88. Merge Sorted Array
 *
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 *
 * Note:
 *
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 * Example:
 *
 * Input:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 *
 * Output: [1,2,2,3,5,6]
 */
public class MergeSortedArray {

    /**
     *全部放入到nums1中，然后排序
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i=0; i<n; i++) {
            nums1[m+i] = nums2[i];
        }

        Arrays.sort(nums1);
    }

    /**
     * 从后向前比较两个数组的元素，将每次比较大的值从后向前依次放入nums1
     *
     * 时间：O(m+n)
     * 空间：O(1)
     */
    public void mergeM1(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {

            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            }
            else {
                nums1[k--] = nums2[j--];
            }
        }

        while (j >= 0)
            nums1[k--] = nums2[j--];

    }
}
