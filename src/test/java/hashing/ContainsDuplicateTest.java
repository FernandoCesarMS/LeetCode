package hashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {
    @Test
    void example1() {
        int[] nums = {1,2,3,1};

        boolean response = ContainsDuplicate.containsDuplicate(
                nums
        );

        assertTrue(response);
    }

    @Test
    void example2() {
        int[] nums = {1,2,3,4};

        boolean response = ContainsDuplicate.containsDuplicate(
                nums
        );

        assertFalse(response);
    }

    @Test
    void example3() {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};

        boolean response = ContainsDuplicate.containsDuplicate(
                nums
        );

        assertTrue(response);
    }
}