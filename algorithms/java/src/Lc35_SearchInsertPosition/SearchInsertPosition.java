package Lc35_SearchInsertPosition;

/**
 * 35. Search Insert Position
 *
 * Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 *
 * Example 1:
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 *
 * Example 2:
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 *
 * Example 3:
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 *
 *
 * Constraints:
 * 1 <= nums.length <= 10^4
 * -10^4 <= nums[i] <= 10^4
 * nums contains distinct values sorted in ascending order.
 * -10^4 <= target <= 10^4
 */
public class SearchInsertPosition {

    /**
     * Solution 1: Binary search
     *
     * Time complexity : O(log n)
     * Space complexity : O(1)
     */
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        if (target <= nums[0]) return 0;
        if (target > nums[n - 1]) return n;
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = (right + left) >> 1;
            if (target <= nums[mid])
                right = mid - 1;
            else
                left = mid + 1;
        }
        return left;
    }
}
