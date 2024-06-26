package hashing;

/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true

https://leetcode.com/problems/contains-duplicate/description/

*/

import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};

        boolean answer = containsDuplicate(nums);
        System.out.printf(
                "Answer: [%s]", answer
        );
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> result = new HashSet<>();
        for (int num : nums) {
            if (!result.add(num)) {
                return true;
            }
        }

        return false;
    }
}