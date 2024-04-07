package twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static twopointers.ValidPalindrome.isPalindrome;

class ValidPalindromeTest {
    @Test
    public void example1 () {
        boolean answer = isPalindrome("A man, a plan, a canal: Panama");

        assertTrue(answer);
    }

    @Test
    public void example2 () {
        boolean answer = isPalindrome("race a car");

        assertFalse(answer);
    }

    @Test
    public void example3 () {
        boolean answer = isPalindrome(" ");

        assertTrue(answer);
    }
}