package hashing;

/*
Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.



Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]

https://leetcode.com/problems/top-k-frequent-elements/description/

*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int k = 10;
        int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6, 7, 7, 8, 2, 3, 1, 1, 1, 10, 11, 5, 6, 2, 4, 7, 8, 5, 6};
        topKFrequent(nums, k);
    }

    public static int[] topKFrequent(int[] nums, int k) {
        int[] response = new int[k];

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> sortedList = new ArrayList<>(map.values());
        sortedList.sort(Comparator.reverseOrder());

        for (int i = 0; i < k; i++) {
            response[i] = sortedList.get(i);
        }

        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<Integer, Integer>> iterator = entrySet.iterator();
        boolean[] alreadyAdd = new boolean[k];
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            for (int actualPosition = 0; actualPosition < k; actualPosition++) {
                if (response[actualPosition] == entry.getValue() && !alreadyAdd[actualPosition]) {
                    response[actualPosition] = entry.getKey();
                    alreadyAdd[actualPosition] = true;
                    break;
                }
            }
        }

        return response;
    }
}