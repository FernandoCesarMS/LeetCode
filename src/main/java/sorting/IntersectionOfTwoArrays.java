package sorting;

/*
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.



Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.

https://leetcode.com/problems/find-the-duplicate-number/description/?envType=study-plan-v2&envId=top-100-liked

*/

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoArrays {

    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> answerAux = new ArrayList<>();
        for (int num1 : nums1) {
            for (int j = 0; j < nums2.length; j++) {
                if (num1 == nums2[j]) {
                    answerAux.add(num1);
                    nums2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
        int[] answer = new int[answerAux.size()];
        for (int i = 0; i < answerAux.size(); i ++) {
            answer[i] = answerAux.get(i);
        }
        return answer;
    }
}