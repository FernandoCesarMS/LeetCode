package stack;

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false

https://leetcode.com/problems/valid-parentheses/description/

*/

import java.util.ArrayList;
import java.util.List;

public class ValidParentheses {
    public static void main(String[] args) {
        isValid("()");
    }

    public static boolean isValid(String s) {
        List<Character> lastOpened = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                lastOpened.add('(');
            }
            if (c == '[') {
                lastOpened.add('[');
            }
            if (c == '{') {
                lastOpened.add('{');
            }

            if (c == ')') {
                int index = getIndex(lastOpened);
                if (index == -1 || !lastOpened.get(index).equals('(')) {
                    return false;
                }
                lastOpened.remove(index);
            }
            if (c == ']') {
                int index = getIndex(lastOpened);
                if (index == -1 || !lastOpened.get(index).equals('[')) {
                    return false;
                }
                lastOpened.remove(index);
            }
            if (c == '}') {
                int index = getIndex(lastOpened);
                if (index == -1 || !lastOpened.get(index).equals('{')) {
                    return false;
                }
                lastOpened.remove(index);
            }
        }

        return lastOpened.isEmpty();
    }

    private static int getIndex(List<Character> lastOpened) {
        return lastOpened.size() - 1;
    }
}