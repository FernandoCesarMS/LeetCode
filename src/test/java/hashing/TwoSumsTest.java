package hashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoSumsTest {
    @Test
    void example1() {
        int[] nums = {2,7,11,15};

        int[] response = TwoSums.twoSum(
                nums, 9
        );

        assertEquals(0, response[0]);
        assertEquals(1, response[1]);
    }

    @Test
    void example2() {
        int[] nums = {3,2,4};

        int[] response = TwoSums.twoSum(
                nums, 6
        );

        assertEquals(1, response[0]);
        assertEquals(2, response[1]);
    }

    @Test
    void example3() {
        int[] nums = {3,3};

        int[] response = TwoSums.twoSum(
                nums, 6
        );

        assertEquals(0, response[0]);
        assertEquals(1, response[1]);
    }
}