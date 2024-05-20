package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static stack.DailyTemperatures.dailyTemperatures;

class DailyTemperaturesTest {

    @Test
    public void example1() {
        int[] input = {73,74,75,71,69,72,76,73};
        int[] expectedAnswer = {1,1,4,2,1,1,0,0};

        int[] answer = dailyTemperatures(input);

        assertEquals(expectedAnswer.length, answer.length);
        for (int i = 0; i < expectedAnswer.length; i++) {
            assertEquals(expectedAnswer[i], answer[i]);
        }
    }

    @Test
    public void example2() {
        int[] input = {30,40,50,60};
        int[] expectedAnswer = {1,1,1,0};

        int[] answer = dailyTemperatures(input);

        assertEquals(expectedAnswer.length, answer.length);
        for (int i = 0; i < expectedAnswer.length; i++) {
            assertEquals(expectedAnswer[i], answer[i]);
        }
    }

    @Test
    public void example3() {
        int[] input = {30,60,90};
        int[] expectedAnswer = {1,1,0};

        int[] answer = dailyTemperatures(input);

        assertEquals(expectedAnswer.length, answer.length);
        for (int i = 0; i < expectedAnswer.length; i++) {
            assertEquals(expectedAnswer[i], answer[i]);
        }
    }

    @Test
    public void example4() {
        int[] input = {99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99,99};
        int[] expectedAnswer = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

        int[] answer = dailyTemperatures(input);

        assertEquals(expectedAnswer.length, answer.length);
        for (int i = 0; i < expectedAnswer.length; i++) {
            assertEquals(expectedAnswer[i], answer[i]);
        }
    }

}