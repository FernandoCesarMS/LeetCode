package binarysearch;

/*
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.



Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]

https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/?envType=study-plan-v2&envId=top-100-liked

*/

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static int[] searchRange(int[] nums, int target) {
        int[] defaultAnswer = {-1, -1};
        int left = 0;
        int right = nums.length - 1;
        int mid;

        while (left <= right) {
            if (left > 0 && nums[left] == target && nums[left - 1] == target) {
                left--;
                continue;
            }
            if (right < nums.length - 1 && nums[right] == target && nums[right + 1] == target) {
                right++;
                continue;
            }
            mid = (left + right)/2;
            if (nums[right] == target && nums[left] == target) {
                return new int[]{left, right};
            }
            if (nums[left] < nums[mid] && nums[mid] <= target) {
                left = mid == left ? mid + 1 : mid;
            } else if (nums[right] > nums[mid] && nums[mid] >= target) {
                right = mid == right ? mid - 1 : mid;
            } else if (nums[mid] <= target){
                left++;
            } else {
                right--;
            }

        }
        return defaultAnswer;
    }

}