package stack;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GenerateParenthesesTest {

    @Test
    public void example1() {
        int input = 3;
        List<String> expectedAnswer = List.of("()()()","()(())","(()())","(())()","((()))");

        List<String> answer = GenerateParentheses.generateParenthesis(input);

        answer.forEach(
                a -> assertTrue(expectedAnswer.contains(a))
        );
    }

    @Test
    public void example2() {
        int input = 1;
        List<String> expectedAnswer = List.of("()");

        List<String> answer = GenerateParentheses.generateParenthesis(input);

        answer.forEach(
                a -> assertTrue(expectedAnswer.contains(a))
        );
    }
}