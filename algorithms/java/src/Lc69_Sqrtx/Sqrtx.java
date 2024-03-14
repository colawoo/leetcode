package Lc69_Sqrtx;

/**
 * 69. Sqrt(x)
 *
 * Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
 * The returned integer should be non-negative as well.
 *
 * You must not use any built-in exponent function or operator.
 *
 * For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 *
 *
 * Example 1:
 *
 * Input: x = 4
 * Output: 2
 * Explanation: The square root of 4 is 2, so we return 2.
 *
 * Example 2:
 *
 * Input: x = 8
 * Output: 2
 * Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
 *
 *
 * Constraints:
 *
 * 0 <= x <= 2^31 - 1
 */
public class Sqrtx {

    /**
     * Solution 1: Binary search
     *
     * Time complexity : O(log x)
     * Space complexity : O(1)
     */
    public int solution1(int x) {
        int left = 0, right = x;
        while (left <= right) {
            int mid = (left + right) >> 1;
            if ((long) mid * mid == x) {
                return mid;
            }
            if ((long) mid * mid > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }

    /**
     * Solution 2: Newton-Raphson method
     *
     * Time complexity : O(log x)
     * Space complexity : O(1)
     */
    public int solution2(int x) {
        if (x == 0) return x;
        double x0 = x, c = x;
        while (true) {
            double x1 = 0.5 * (x0 + c / x0);
            if (Math.abs(x0 - x1) < 1e-7) {
                break;
            }
            x0 = x1;
        }
        return (int) x0;
    }
}
