package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static stack.ValidParentheses.isValid;

class ValidParenthesesTest {

    @Test
    public void example1() {
        boolean response = isValid("()");

        assertTrue(response);
    }

    @Test
    public void example2() {
        boolean response = isValid("()[]{}");

        assertTrue(response);
    }

    @Test
    public void example3() {
        boolean response = isValid("(]");

        assertFalse(response);
    }

    @Test
    public void example4() {
        boolean response = isValid("[[[]");

        assertFalse(response);
    }

}