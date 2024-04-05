package hashing;

/*
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

Example 1:
Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

Example 2:
Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9

https://leetcode.com/problems/longest-consecutive-sequence/description/

*/

import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {1,2,0,1};

        longestConsecutive(nums);
    }

    public static int longestConsecutive(int[] nums) {
        int length = nums.length;
        if (length == 0) {
            return 0;
        }
        Arrays.sort(nums);

        int biggestSequence = 1;
        int actualSequence = 1;

        for (int i = 0; i < length - 1; i++) {
            if (nums[i + 1] == nums[i] + 1) {
                actualSequence++;
            } else if (nums[i + 1] != nums[i]){
                if (actualSequence > biggestSequence) {
                    biggestSequence = actualSequence;
                }
                actualSequence = 1;
            }
        }


        return Math.max(actualSequence, biggestSequence);
    }
}