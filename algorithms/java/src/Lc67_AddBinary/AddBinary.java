package Lc67_AddBinary;


/**
 * 67. Add Binary
 *
 * Given two binary strings a and b, return their sum as a binary string.
 *
 * Example 1:
 *
 * Input: a = "11", b = "1"
 * Output: "100"
 *
 * Example 2:
 *
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 *
 *
 * Constraints:
 *
 * 1 <= a.length, b.length <= 10^4
 * a and b consist only of '0' or '1' characters.
 * Each string does not contain leading zeros except for the zero itself.
 */
public class AddBinary {

    /**
     * Solution 1:
     * Time complexity : O(max{|a|, |b|})
     * Space complexity : O(1)
     */
    public String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            sum += i < 0 ? 0 : a.charAt(i--) - '0';
            sum += j < 0 ? 0 : b.charAt(j--) - '0';
            ans.append(sum % 2);
            carry = sum / 2;
        }
        if (carry == 1) ans.append(carry);
        return ans.reverse().toString();
    }
}
