package hashing;

/*
Given an integer array arr, return true if there are three consecutive odd numbers in the array. Otherwise, return false.

Example 1:

Input: arr = [2,6,4,1]
Output: false
Explanation: There are no three consecutive odds.
Example 2:

Input: arr = [1,2,34,3,4,5,7,23,12]
Output: true
Explanation: [5,7,23] are three consecutive odds.



https://leetcode.com/problems/single-number/description/?envType=study-plan-v2&envId=top-100-liked

*/

public class ThreeConsecutiveOdds {

    public static boolean threeConsecutiveOdds(int[] arr) {
        int totalConsecutive = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                totalConsecutive = 0;
            } else if (++totalConsecutive == 3) {
                return true;
            }
        }

        return false;
    }
}