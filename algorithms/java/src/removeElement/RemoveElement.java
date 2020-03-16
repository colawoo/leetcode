package removeElement;

/**
 * 27. Remove Element
 *
 * Given an array nums and a value val, remove all instances of that value in-place and return the new length.
 *
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 *
 * Example 1:
 *
 * Given nums = [3,2,2,3], val = 3,
 *
 * Your function should return length = 2, with the first two elements of nums being 2.
 *
 * It doesn't matter what you leave beyond the returned length.
 * Example 2:
 *
 * Given nums = [0,1,2,2,3,0,4,2], val = 2,
 *
 * Your function should return length = 5, with the first five elements of nums containing 0, 1, 3, 0, and 4.
 *
 * Note that the order of those five elements can be arbitrary.
 *
 * It doesn't matter what values are set beyond the returned length.
 */
public class RemoveElement {

    public int removeElement(int[] nums, int val) {

        for (int i=0; i<nums.length; i++) {
            if (nums[i] ==val) {
                for (int j=nums.length-1; j>-1; j--) {
                    if (nums[j] != val && i < j) {
                        nums[i] = nums[j];
                        nums[j] = val;
                        break;
                    }
                    if (i >= j) {
                        return i;
                    }
                }
            }
        }

        return nums.length;
    }

    /**
     * Time complexity : O(n)
     *
     * Space complexity : O(1)
     */
    public int removeElementM1(int[] nums, int val) {
        if (nums.length == 0) return 0;

        int index = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] != val) {
                nums[index++] = nums[i];
            }
        }

        return index;
    }

    /**
     * Two Pointers - when elements to remove are rare
     *
     * Time complexity : O(n)
     *
     * Space complexity : O(1)
     */
    public int removeElementM2(int[] nums, int val) {
        if (nums.length == 0) return 0;

        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n-1];
                n--;
            }
            else {
                i++;
            }
        }

        return n;
    }

}
