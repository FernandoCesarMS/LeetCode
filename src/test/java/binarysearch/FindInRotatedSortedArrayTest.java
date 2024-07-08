package binarysearch;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindInRotatedSortedArrayTest {
    @ParameterizedTest
    @MethodSource(value = "provideTestCases")
    void givenTestCases_provideExpectedAnswers(int[] nums, int target, int expectedAnswer) {
        int answer = FindInRotatedSortedArray.search(nums, target);
        assertEquals(expectedAnswer, answer);
    }

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(new int[]{4,5,6,7,0,1,2}, 0, 4),
                Arguments.of(new int[]{1}, 0, -1),
                Arguments.of(new int[]{1,3}, 3, 1),
                Arguments.of(new int[]{4,5,6,7,0,1,2}, 3, -1)
        );
    }

}