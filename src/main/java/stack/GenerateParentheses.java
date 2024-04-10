package stack;

/*
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
Example 1:

Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
Example 2:

Input: n = 1
Output: ["()"]

https://leetcode.com/problems/generate-parentheses/description/

*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenerateParentheses {

    public static void main(String[] args) {
        generateParenthesis(3);
    }

    public static List<String> generateParenthesis(int n) {
        Set<String> response = new HashSet<>();
        response.add("()");
        for (int i = 1; i < n; i++) {
            for (String s : new ArrayList<>(response)) {
                for (int j = 0; j <= s.length(); j++) {
                    StringBuilder sb = new StringBuilder(s);
                    sb.insert(j, "()");
                    response.add(sb.toString());
                }
            }
        }

        List<String> filteredStrings = new ArrayList<>();
        for (String s : response) {
            if (s.length() == 2 * n) {
                filteredStrings.add(s);
            }
        }

        return filteredStrings;
    }
}