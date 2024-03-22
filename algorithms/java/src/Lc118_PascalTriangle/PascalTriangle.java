package Lc118_PascalTriangle;

import java.util.ArrayList;
import java.util.List;

/**
 * 118. Pascal's Triangle
 *
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 *
 * In Pascal's triangle, each number is the sum of the two numbers directly above it.
 *
 *
 * Example 1:
 *
 * Input: numRows = 5
 * Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 *
 * Example 2:
 *
 * Input: numRows = 1
 * Output: [[1]]
 */
public class PascalTriangle {

    /**
     * Solution 1: Recursion
     * Time complexity : O(numRows^2)
     * Space complexity : O(numRows^2)
     */
    public List<List<Integer>> solution1(int numRows) {
        if (numRows == 1) {
            List<List<Integer>> ans = new ArrayList<>();
            ans.add(new ArrayList<>());
            ans.get(0).add(1);
            return ans;
        }
        List<List<Integer>> preRow = solution1(numRows - 1);
        List<Integer> curRow = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            curRow.add(1);
        }
        for (int i = 1; i < numRows - 1; i++) {
            curRow.set(i, preRow.get(numRows - 2).get(i - 1) + preRow.get(numRows - 2).get(i));
        }
        preRow.add(curRow);
        return preRow;
    }

    /**
     * Solution 2: Dynamic Programming
     * Time complexity : O(numRows^2)
     * Space complexity : O(1)
     */
    public List<List<Integer>> solution2(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> curRow = new ArrayList<>();
            ans.add(curRow);
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    curRow.add(1);
                } else {
                    List<Integer> preRow = ans.get(i - 1);
                    curRow.add(preRow.get(j) + preRow.get(j - 1));
                }
            }
        }
        return ans;
    }
}