package misc;

/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2


https://leetcode.com/problems/single-number/description/?envType=study-plan-v2&envId=top-100-liked

*/

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MajorityElements {

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> valueByKey = new HashMap<>();

        for (int num : nums) {
            valueByKey.put(num, valueByKey.getOrDefault(num, 0) + 1);
        }

        return Collections.max(valueByKey.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}