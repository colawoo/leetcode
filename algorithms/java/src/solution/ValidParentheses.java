package solution;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 *
 *
 * Example 1:
 * Input: s = "()"
 * Output: true
 *
 * Example 2:
 * Input: s = "()[]{}"
 * Output: true
 *
 * Example 3:
 * Input: s = "(]"
 * Output: false
 *
 *
 * Constraints:
 * 1 <= s.length <= 10^4
 * s consists of parentheses only '()[]{}'.
 */
public class ValidParentheses {

    Map<Character, Character> pairs = new HashMap<Character, Character>() {{
        put('(', ')');
        put('{', '}');
        put('[', ']');
    }};

    /**
     * Stack
     * Time complexity : O(n)
     * Space complexity : O(n)
     */
    public boolean isValid(String s) {
        Deque<Character> closeBracketStack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // When you encounter an open bracket,
            // push the corresponding close bracket to the top of the stack.
            if (pairs.containsKey(c)) {
                Character closeBracket = pairs.get(c);
                closeBracketStack.push(closeBracket);
            } else if (closeBracketStack.isEmpty() || closeBracketStack.pop() != c) {
                return false;
            }
        }
        return closeBracketStack.isEmpty();
    }
}
