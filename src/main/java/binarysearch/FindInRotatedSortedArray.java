package binarysearch;

/*
There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
Example 3:

Input: nums = [1], target = 0
Output: -1

https://leetcode.com/problems/search-in-rotated-sorted-array/description/?envType=study-plan-v2&envId=top-100-liked

*/

public class FindInRotatedSortedArray {

    public static int search(int[] nums, int target) {
        int length = nums.length;
        if (isTargetNotIncludedInArray(nums, target, length)) {
            return -1;
        }

        int middlePosition = -1;
        boolean isInRight = nums[0] > target;
        for (int i = 0; i < length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                middlePosition = i;
                break;
            } else if (i + 1 == length - 1) {
                middlePosition = i + 1;
                isInRight = false;
            }
        }

        if (middlePosition == -1) {
            return nums[0] == target ? 0 : -1;
        }

        int leftLimit;
        int rightLimit;

        if (isInRight) {
            leftLimit = middlePosition;
            rightLimit = length - 1;
            middlePosition = (middlePosition + length) / 2;
        } else {
            leftLimit = 0;
            rightLimit = middlePosition;
            middlePosition = middlePosition / 2;
        }

        while (leftLimit <= rightLimit) {
            if (nums[middlePosition] == target) {
                return middlePosition;
            }

            if (nums[middlePosition] > target) {
                rightLimit = rightLimit == middlePosition ? rightLimit - 1 : middlePosition;
            } else {
                leftLimit = leftLimit == middlePosition ? leftLimit + 1 : middlePosition;
            }

            middlePosition = (rightLimit + leftLimit) / 2;
        }

        return -1;
    }

    private static boolean isTargetNotIncludedInArray(int[] nums, int target, int length) {
        if (length == 0) {
            return true;
        }

        return nums[0] > target && nums[length - 1] < target;
    }
}