package solution;

/**
 * 66. Plus One
 *
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
 *
 * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
 *
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 *
 * Example 1:
 *
 * Input: [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Example 2:
 *
 * Input: [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 */
public class PlusOne {


    /**
     *
     * 时间：O(n)
     * 空间：O(1)
     */
    public int[] plusOne(int[] digits) {

        boolean flag = true;
        for (int i=digits.length-1; i>=0; i--) {

            if (flag) {
                digits[i]++;
            }

            if (digits[i]/10 > 0) {
                flag = true;
                digits[i] = digits[i] % 10;
            }
            else {
                flag = false;
                break;
            }
        }

        if (flag) {
            int[] copy = new int[digits.length + 1];
            copy[0] = 1;
            System.arraycopy(digits, 0, copy, 1, digits.length);
            return copy;
        }

        return digits;
    }

    /**
     *
     * 时间：O(n)
     * 空间：O(1)
     */
    public int[] plusOneM1(int[] digits) {

        for (int i=digits.length-1; i>=0; i--) {

            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            else {
                digits[i] = 0;
            }
        }

        int[] copy = new int[digits.length + 1];
        copy[0] = 1;
        return copy;
    }

}
