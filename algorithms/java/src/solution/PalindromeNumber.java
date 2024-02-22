package solution;

/**
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 *
 * Example 1:
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 *
 * Example 2:
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 *
 * Example 3:
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 *
 *
 * Constraints:
 * -2^31 <= x <= 2^31 - 1
 */
public class PalindromeNumber {

    /**
     * Solution 1: Reversing the Entire Number
     * Time complexity : O(logn)
     * Space complexity : O(1)
     */
    public boolean solution1(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) return false;
        int reversed = 0;
        int temp = x;
        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        return x == reversed;
    }

    /**
     * Solution 2: Reversing Half of the Number
     * Time complexity : O(logn)
     * Space complexity : O(1)
     */
    public boolean solution2(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) return false;
        int reversed = 0;
        int temp = x;
        while (temp > reversed) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        return temp == reversed || temp == reversed / 10;
    }
}
