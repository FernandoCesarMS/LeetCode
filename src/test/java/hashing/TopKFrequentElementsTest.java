package hashing;

import org.junit.jupiter.api.Test;

import static hashing.TopKFrequentElements.topKFrequent;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TopKFrequentElementsTest {
    @Test
    void example1() {
        int k = 2;
        int[] nums = {1,1,1,2,2,3};
        int[] response = topKFrequent(nums, k);

        int[] expected = {1, 2};
        for (int i = 0; i < response.length; i++) {
            assertEquals(expected[i], response[i]);
        }
    }

    @Test
    void example2() {
        int k = 1;
        int[] nums = {1};
        int[] response = topKFrequent(nums, k);

        int[] expected = {1};
        for (int i = 0; i < response.length; i++) {
            assertEquals(expected[i], response[i]);
        }
    }

}