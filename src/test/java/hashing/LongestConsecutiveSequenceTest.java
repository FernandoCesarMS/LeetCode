package hashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestConsecutiveSequenceTest {
    @Test
    void example1() {
        int[] nums = {100,4,200,1,3,2};

        int response = LongestConsecutiveSequence.longestConsecutive(nums);

        assertEquals(4, response);
    }

    @Test
    void example2() {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};

        int response = LongestConsecutiveSequence.longestConsecutive(nums);

        assertEquals(9, response);
    }

    @Test
    void example3() {
        int[] nums = {1,2,0,1};

        int response = LongestConsecutiveSequence.longestConsecutive(nums);

        assertEquals(3, response);
    }

    @Test
    void example4() {
        int[] nums = {};

        int response = LongestConsecutiveSequence.longestConsecutive(nums);

        assertEquals(0, response);
    }
}