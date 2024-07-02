package misc;

/*
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.

Example 1:

Input: nums = [1,3,4,2,2]
Output: 2
Example 2:

Input: nums = [3,1,3,4,2]
Output: 3
Example 3:

Input: nums = [3,3,3,3,3]
Output: 3

https://leetcode.com/problems/find-the-duplicate-number/description/?envType=study-plan-v2&envId=top-100-liked

*/

import java.util.HashSet;

public class FindDuplicateNumber {

    public static int findDuplicate(int[] nums) {
        HashSet<Integer> values = new HashSet<>();
        for(int num : nums) {
            if (!values.add(num)) {
                return num;
            }
        }

        return -1;
    }
}