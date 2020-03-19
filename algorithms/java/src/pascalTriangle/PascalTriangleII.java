package pascalTriangle;

import java.util.ArrayList;
import java.util.List;

/**
 * 119. Pascal's Triangle II
 *
 * Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.
 *
 * Note that the row index starts from 0.
 *
 * In Pascal's triangle, each number is the sum of the two numbers directly above it.
 *
 * Example:
 *
 * Input: 3
 * Output: [1,3,3,1]
 * Follow up:
 *
 * Could you optimize your algorithm to use only O(k) extra space?
 */
public class PascalTriangleII {


    public static List<Integer> getRow(int rowIndex) {

        List<Integer> result = new ArrayList<>(rowIndex+1);
        result.add(0, 1);
        for (int i=1; i<rowIndex+1; i++) {
            result.add(i, 0);
        }

        for (int i=0; i<rowIndex; i++) {
            for (int j=i+1; j>0; j--) {
                result.set(j, result.get(j) + result.get(j-1));
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int rowIndex = 3;
        int size = rowIndex + 1;

        List<Integer> list = getRow(rowIndex);
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i=0; i< size; i++) {
            sb.append(list.get(i));
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

}
