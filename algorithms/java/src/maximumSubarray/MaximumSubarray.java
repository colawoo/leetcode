package maximumSubarray;

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 *
 * Example:
 *
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * Follow up:
 *
 * If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */
public class MaximumSubarray {

    /**
     * 穷举法。
     *
     * 时间：O(n^3)
     * 空间：O(1)
     */
    public int maxSubArray(int[] nums) {

        if (nums.length == 0) throw new IllegalArgumentException("array nums is empty");

        int len = nums.length;
        int sumMax = nums[0];
        for (int i=0; i<len; i++) {
            for (int j=i; j<len; j++) {
                int temp=0;
                for (int x=i; x<=j; x++) temp+=nums[x];
                if (temp > sumMax) sumMax = temp;
            }
        }

        return sumMax;
    }


    /**
     * 穷举方法的一种优化。
     * 假设新建一个数组sumArr，使sumArr[i] = nums[0] + ... + nums[i]
     * 则i ~ j之间的和为sumArr[j] - sumArr[i-1]
     *
     * 时间：O(n^2)
     * 空间：O(1)
     */
    public int maxSubArrayM1(int[] nums) {

        if (nums.length == 0) throw new IllegalArgumentException("array nums is empty");

        int len = nums.length;
        int sumMax = nums[0];
        for (int i=1; i<len; i++) {
            nums[i] = nums[i - 1] + nums[i];
        }

        for (int i=0; i<len; i++) {
            for (int j=i; j<len; j++) {
                int temp = (i > 0) ? (nums[j] - nums[i - 1]) : nums[j];
                if (temp > sumMax) sumMax = temp;
            }
        }

        return sumMax;
    }

    /**
     * 动态规划
     *
     * dp[i] = max(nums[i], nums[i] + dp[i-1])
     *      i       数组中的第i个元素的位置
     *      dp[i]   从0到i的闭区间内，所有包含第i个元素的连续子数组中，总和最大的值
     *
     * 时间：O(n)
     * 空间：O(1)
     */
    public int maxSubArrayM2(int[] nums) {

        if (nums.length == 0)
            throw new IllegalArgumentException("array nums is empty");

        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = nums[0];
        int sumMax = dp[0];

        for (int i=1; i<len; i++) {
            dp[i] = nums[i] > (nums[i] + dp[i-1])?nums[i]:(nums[i] + dp[i-1]);
            if (dp[i] > sumMax) sumMax = dp[i];
        }

        return sumMax;
    }


    /**
     * 动态规划
     *
     * 不用单独分配一块dp内存，仍然使用原数组
     *
     */
    public int maxSubArrayM3(int[] nums) {

        if (nums.length == 0)
            throw new IllegalArgumentException("array nums is empty");

        int sumMax = nums[0];
        for (int i=1; i<nums.length; i++) {
            nums[i] = Math.max(nums[i], nums[i] + nums[i-1]);
            if (nums[i] > sumMax) sumMax = nums[i];
        }

        return sumMax;
    }

}
