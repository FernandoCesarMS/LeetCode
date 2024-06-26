package misc;

/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:
Input: nums = [2,2,1]
Output: 1

Example 2:
Input: nums = [4,1,2,1,2]
Output: 4

Example 3:
Input: nums = [1]
Output: 1

https://leetcode.com/problems/single-number/description/?envType=study-plan-v2&envId=top-100-liked

*/

import java.util.HashSet;
import java.util.Set;

public class SimpleNumbers {
    public static void main(String[] args) {
        int[] nums = {1};

        System.out.printf(
                "Unique Number: %d", singleNumber(nums)
        );
    }

    public static int singleNumber(int[] nums) {
        Set<Integer> response = new HashSet<>();
        for (int num : nums) {
            if (response.contains(num)) {
                response.remove(num);
                continue;
            }
            response.add(num);
        }

        return response.stream().findAny().get();
    }
}