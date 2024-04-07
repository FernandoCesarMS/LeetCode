package twopointers;

/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.



Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.

https://leetcode.com/problems/valid-palindrome/description/

*/

import java.util.ArrayList;
import java.util.List;

public class ValidPalindrome {

    public static final int ASCII_TABLE_VALUE_CHARACTER_A = 97;
    public static final int ASCII_TABLE_VALUE_CHARACTER_Z = 122;
    public static final int ASCII_TABLE_VALUE_CHARACTER_0 = 48;
    public static final int ASCII_TABLE_VALUE_CHARACTER_9 = 57;

    public static void main(String[] args) {
        isPalindrome("A man, a plan, a canal: Panama");
    }

    public static boolean isPalindrome(String input) {
        List<Character> phraseWithoutSpecialCharacters = removeSpecialCharactersFromString(input);

        for (int i = 0; i < phraseWithoutSpecialCharacters.size() / 2; i++) {
            if (isCurrentCharacterEqualsToCorrespondingCharacterInFinalOfTheString(phraseWithoutSpecialCharacters, i)) {
                return false;
            }
        }

        return true;
    }

    private static boolean isCurrentCharacterEqualsToCorrespondingCharacterInFinalOfTheString(List<Character> phraseWithoutSpecialCaracters, int i) {
        return phraseWithoutSpecialCaracters.get(i) != phraseWithoutSpecialCaracters.get(phraseWithoutSpecialCaracters.size() - (1 + i));
    }

    private static List<Character> removeSpecialCharactersFromString(String s) {
        s = s.toLowerCase();
        List<Character> phraseWithoutSpecialCharacters = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (isMinusculeLetter(c) || isNumber(c)) {
                phraseWithoutSpecialCharacters.add(c);
            }
        }
        return phraseWithoutSpecialCharacters;
    }

    private static boolean isMinusculeLetter(char c) {
        return c >= ASCII_TABLE_VALUE_CHARACTER_A && c <= ASCII_TABLE_VALUE_CHARACTER_Z;
    }

    private static boolean isNumber(char c) {
        return c >= ASCII_TABLE_VALUE_CHARACTER_0 && c <= ASCII_TABLE_VALUE_CHARACTER_9;
    }
}