package hashing;

/*
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.

Example 1:
Input: nums = [1,2,3,4]
Output: [24,12,8,6]

Example 2:
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]

https://leetcode.com/problems/product-of-array-except-self/description/

*/

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

        productExceptSelf(nums);
    }

    public static int[] productExceptSelf(int[] nums) {
        int totalZeros = 0;
        int length = nums.length;
        int[] response = new int[length];
        for (int num : nums) {
            if (num == 0) {
                totalZeros++;
            }
        }

        if (totalZeros > 1) {
            Arrays.fill(response, 0);
            return response;
        }

        if (totalZeros == 1) {
            Arrays.fill(response, 0);
            int totalValue = 1;
            int positionZero = -1;
            for (int i = 0; i < length; i++) {
                if (nums[i] != 0) {
                    totalValue *= nums[i];
                } else {
                    positionZero = i;
                }
            }
            response[positionZero] = totalValue;
            return response;
        }

        int[] pre = new int[length];
        int[] suff = new int[length];
        Arrays.fill(response, 1);
        Arrays.fill(pre, 1);
        Arrays.fill(suff, 1);
        for (int i = 1; i < length; i++) {
            pre[i] = pre[i - 1] * nums[i - 1];
        }

        for (int i = length - 2; i >= 0; i--) {
            suff[i] = suff[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < length; i++) {
            response[i] = pre[i] * suff[i];
        }

        return response;
    }
}