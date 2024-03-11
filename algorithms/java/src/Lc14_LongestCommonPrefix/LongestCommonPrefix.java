package Lc14_LongestCommonPrefix;

/**
 * 14. Longest Common Prefix
 *
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 * Example 1:
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 *
 * Example 2:
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 *
 * Constraints:
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lowercase English letters.
 */
public class LongestCommonPrefix {

    /**
     * Solition 2: Horizontal Scanning
     * Time complexity : O(mn)
     * Space complexity : O(1)
     */
    public String solution1(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String a = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (a.length() == 0) {
                break;
            }
            a = solution1(a, strs[i]);
        }
        return a;
    }

    public String solution1(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());
        int index = 0;
        while (index < minLength && str1.charAt(index) == str2.charAt(index)) {
            index++;
        }
        return str1.substring(0, index);
    }

    /**
     * Solition 2: Vertical Scanning
     * Time complexity : O(mn)
     * Space complexity : O(1)
     */
    public String solution2(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String first = strs[0];
        int len = first.length();
        int count = strs.length;
        for (int i = 0; i < len; i++) {
            char c = first.charAt(i);
            for (int j = 1; j < count; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return first.substring(0, i);
                }
            }
        }
        return first;
    }
}
