package misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleNumbersTest {

    @Test
    void example1() {
        int response = SimpleNumbers.singleNumber(
                new int[]{2, 2, 1}
        );

        assertEquals(1, response);
    }

    @Test
    void example2() {
        int response = SimpleNumbers.singleNumber(
                new int[]{4,1,2,1,2}
        );

        assertEquals(4, response);
    }

    @Test
    void example3() {
        int response = SimpleNumbers.singleNumber(
                new int[]{1}
        );

        assertEquals(1, response);
    }
}