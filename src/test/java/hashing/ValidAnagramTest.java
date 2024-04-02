package hashing;

import org.junit.jupiter.api.Test;

import static hashing.ValidAnagram.isAnagram;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidAnagramTest {
    @Test
    void example1() {
        boolean answer = isAnagram("anagram", "nagaram");

        assertTrue(answer);
    }

    @Test
    void example2() {
        boolean answer = isAnagram("rat", "car");

        assertFalse(answer);
    }

    @Test
    void example3() {
        boolean answer = isAnagram("ac", "bb");

        assertFalse(answer);
    }
}