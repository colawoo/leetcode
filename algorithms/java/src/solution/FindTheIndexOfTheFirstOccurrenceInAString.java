package solution;

/**
 * 28. Find the Index of the First Occurrence in a String
 *
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if
 * needle is not part of haystack.
 *
 *
 * Example 1:
 * Input: haystack = "sadbutsad", needle = "sad"
 * Output: 0
 * Explanation: "sad" occurs at index 0 and 6.
 * The first occurrence is at index 0, so we return 0.
 *
 * Example 2:
 * Input: haystack = "leetcode", needle = "leeto"
 * Output: -1
 * Explanation: "leeto" did not occur in "leetcode", so we return -1.
 *
 *
 * Constraints:
 * 1 <= haystack.length, needle.length <= 10^4
 * haystack and needle consist of only lowercase English characters.
 */
public class FindTheIndexOfTheFirstOccurrenceInAString {

    /**
     * Solution 1: Brute Force
     * Time complexity : O(mn)
     * Space complexity : O(1)
     */
    public int solution1(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();
        int ans = 0;
        while (ans <= m - n) {
            for (int i = 0; i < n; i++) {
                if (needle.charAt(i) != haystack.charAt(i + ans)) {
                    ans++;
                    break;
                }
                if (i == n - 1) {
                    return ans;
                }
            }
        }
        return -1;
    }

    /**
     * Solution 2: KMP
     * Time complexity : O(m+n)
     * Space complexity : O(n)
     */
    public int solution2(String haystack, String needle) {
        int m = haystack.length(), n = needle.length();
        int[] next = getNext(needle);
        for (int i = 0, j = 0; i < m; i++) {
            while (j > 0 && needle.charAt(j) != haystack.charAt(i)) {
                j = next[j - 1];
            }
            if (needle.charAt(j) == haystack.charAt(i)) {
                j++;
            }
            if (j == n) {
                return i - n + 1;
            }
        }
        return -1;
    }

    public int[] getNext(String needle) {
        int n = needle.length();
        int[] next = new int[n]; // inital value 0
        int j = 0;
        for (int i = 1; i < n; i++) {
            while (j > 0 && needle.charAt(i) != needle.charAt(j)) {
                j = next[j - 1];
            }
            if (needle.charAt(i) == needle.charAt(j)) {
                j++;
            }
            next[i] = j;
        }
        return next;
    }
}
