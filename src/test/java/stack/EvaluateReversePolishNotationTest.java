package stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EvaluateReversePolishNotationTest {

    @Test
    public void example1() {
        String[] input = new String[]{"2","1","+","3","*"};

        int response = EvaluateReversePolishNotation.evalRPN(input);

        Assertions.assertEquals(9, response);
    }

    @Test
    public void example2() {
        String[] input = new String[]{"4","13","5","/","+"};

        int response = EvaluateReversePolishNotation.evalRPN(input);

        Assertions.assertEquals(6, response);
    }

    @Test
    public void example3() {
        String[] input = new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"};

        int response = EvaluateReversePolishNotation.evalRPN(input);

        Assertions.assertEquals(22, response);
    }

}