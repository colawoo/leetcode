package searchInsertPosition;

/**
 * 35. Search Insert Position
 *
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 *
 * You may assume no duplicates in the array.
 *
 * Example 1:
 *
 * Input: [1,3,5,6], 5
 * Output: 2
 * Example 2:
 *
 * Input: [1,3,5,6], 2
 * Output: 1
 * Example 3:
 *
 * Input: [1,3,5,6], 7
 * Output: 4
 * Example 4:
 *
 * Input: [1,3,5,6], 0
 * Output: 0
 */
public class SearchInsertPosition {

    /**
     *
     * Time complexity : O(lgn)
     *
     * Space complexity : O(1)
     *
     */
    public int searchInsert(int[] nums, int target) {

        int len = nums.length;
        if (len == 0) return 0;
        if (target <= nums[0]) return 0;
        if (target == nums[len-1]) return len - 1;
        if (target > nums[len-1]) return len;

        int low = 0;
        int high = len-1;
        int mid = 0;
        while (high >= low) {

            mid = (high+low)/2;

            if (target == nums[mid]) {
                return mid;
            }
            if (target > nums[mid]) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }

        }

        return low;
    }

}
