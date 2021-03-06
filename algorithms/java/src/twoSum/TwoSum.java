package twoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class TwoSum {

    /**
     *
     * Time complexity : O(n^2)
     *
     * Space complexity : O(1)
     *
     */
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == target - nums[j]) {
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }


    /**
     *
     * Time complexity : O(n)
     *
     * Space complexity : O(n)
     *
     */
    public int[] twoSumV1(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int ele = target - nums[i];
            if (map.containsKey(ele) && map.get(ele) != i) {
                return new int[]{i, map.get(ele)};
            }
        }

        throw new IllegalArgumentException("No two sum solution");
    }


    /**
     *
     * Time complexity : O(n)
     *
     * Space complexity : O(n)
     *
     */
    public int[] twoSumV2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
        }

        throw new IllegalArgumentException("No two sum solution");
    }

}
