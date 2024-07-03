package queue;

/*
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.



Example 1:

Input: s = "leetcode"
Output: 0
Example 2:

Input: s = "loveleetcode"
Output: 2
Example 3:

Input: s = "aabb"
Output: -1

https://leetcode.com/problems/first-unique-character-in-a-string/description/

*/

import java.util.HashMap;

public class FirstUniqueCaracterInString {

    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < charArray.length; i++) {
            if (map.get(charArray[i]) == 1) {
                return i;
            }
        }

        return -1;
    }
}