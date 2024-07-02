package hashing;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchA2DMatrixTest {

    @ParameterizedTest
    @MethodSource(value = "provideTestCases")
    void givenTestCases_provideExpectedAnswers(int[][] input, int target, boolean expectedAnswer) {
        boolean answer = SearchA2DMatrix.searchMatrix(input, target);
        assertEquals(expectedAnswer, answer);
    }
    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(new int[][] {{ 1,3,5,7 },{ 10,11,16,20 }, {23,30,34,50}}, 10, true),
                Arguments.of(new int[][] {{ -10, -10 },{ -9, -8 }}, 1, false),
                Arguments.of(new int[][] {{ 1, 3 }}, 2, false),
                Arguments.of(new int[][] {{ 1 }}, 2, false),
                Arguments.of(new int[][] {{ 1 }}, 1, true),
                Arguments.of(new int[][] {{ 1,3,5,7 }, { 10,11,16,20 }, { 23,30,34,60 }}, 3, true),
                Arguments.of(new int[][] {{ 1,3,5,7 }, { 10,11,16,20 }, { 23,30,34,60 }}, 13, false)
        );
    }
}