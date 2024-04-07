package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinStackTest {

    private final MinStack minStack = new MinStack();
    @Test
    public void example1() {
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        int answer1 = minStack.getMin();
        assertEquals(-3, answer1);

        minStack.pop();
        int answer2 = minStack.top();
        assertEquals(0, answer2);

        int answer3 = minStack.getMin();
        assertEquals(-2, answer3);
    }

    @Test
    public void example2() {
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        int answer1 = minStack.getMin();
        assertEquals(-3, answer1);

        minStack.pop();
        int answer2 = minStack.top();
        assertEquals(0, answer2);

        int answer3 = minStack.getMin();
        assertEquals(-2, answer3);
    }
}