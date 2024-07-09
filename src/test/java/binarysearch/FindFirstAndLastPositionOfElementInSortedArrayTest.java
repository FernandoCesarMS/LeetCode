package binarysearch;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FindFirstAndLastPositionOfElementInSortedArrayTest {
    @ParameterizedTest
    @MethodSource(value = "provideTestCases")
    void givenTestCases_provideExpectedAnswers(int[] nums, int target, int[] expectedAnswer) {
        int[] answer = FindFirstAndLastPositionOfElementInSortedArray.searchRange(nums, target);
        assertArrayEquals(expectedAnswer, answer);
    }

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,3,3,3,4,5,9}, 3, new int[]{2,5}),
                Arguments.of(new int[]{1,2,2}, 1, new int[]{0,0}),
                Arguments.of(new int[]{5,7,7,8,8,10}, 6, new int[]{-1,-1}),
                Arguments.of(new int[]{5,7,7,8,8,10}, 8, new int[]{3,4}),
                Arguments.of(new int[]{}, 0, new int[]{-1,-1})
        );
    }
}