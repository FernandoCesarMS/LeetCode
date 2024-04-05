package hashing;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static hashing.ProductOfArrayExceptSelf.productExceptSelf;
import static org.junit.jupiter.api.Assertions.*;

class ProductOfArrayExceptSelfTest {

    @Test
    void example1() {
        int[] nums = {1,2,3,4};

        int[] answer = productExceptSelf(nums);

        List<Integer> expectedAnswerList = new ArrayList<>();
        expectedAnswerList.add(24);
        expectedAnswerList.add(12);
        expectedAnswerList.add(8);
        expectedAnswerList.add(6);

        for (int i = 0; i < answer.length; i++) {
            assertEquals(expectedAnswerList.get(i), answer[i]);
        }
    }

    @Test
    void example2() {
        int[] nums = {-1,1,0,-3,3};

        int[] answer = productExceptSelf(nums);

        List<Integer> expectedAnswerList = new ArrayList<>();
        expectedAnswerList.add(0);
        expectedAnswerList.add(0);
        expectedAnswerList.add(9);
        expectedAnswerList.add(0);
        expectedAnswerList.add(0);

        for (int i = 0; i < answer.length; i++) {
            assertEquals(expectedAnswerList.get(i), answer[i]);
        }
    }
}