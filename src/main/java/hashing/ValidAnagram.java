package hashing;

/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false

https://leetcode.com/problems/valid-anagram/description/

*/

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        boolean answer = isAnagram("rat", "car");
        System.out.printf(
                "Answer: [%s]", answer
        );
    }

    public static boolean isAnagram(String s, String t) {
        char[] charsS = s.toCharArray();
        char[] charsT = t.toCharArray();
        Arrays.sort(charsS);
        Arrays.sort(charsT);

        return Arrays.equals(charsS, charsT);
    }

//    public static int TOTAL_LETTERS = 26;
//
//    public static boolean isAnagram(String s, String t) {
//        int[] count = new int[TOTAL_LETTERS];
//
//        for (char caracter : s.toCharArray()) {
//            count[getCaracterIndex(caracter)]++;
//        }
//
//        for (char caracter : t.toCharArray()) {
//            count[getCaracterIndex(caracter)]--;
//        }
//
//        for(int value : count) {
//            if (value != 0) {
//                return false;
//            }
//        }
//
//        return true;
//    }
//
//    private static int getCaracterIndex(char caracter) {
//        return caracter - 'a';
//    }
}