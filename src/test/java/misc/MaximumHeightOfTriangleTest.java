package misc;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MaximumHeightOfTriangleTest {

    @ParameterizedTest
    @MethodSource(value = "provideTestCases")
    void givenTestCases_provideExpectedAnswers(int red, int blue, int expectedAnswer) {
        int answer = MaximumHeightOfTriangle.maxHeightOfTriangle(red, blue);
        assertEquals(expectedAnswer, answer);
    }

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(2, 4, 3),
                Arguments.of(2, 1, 2),
                Arguments.of(1, 1, 1),
                Arguments.of(10, 1, 2)
        );
    }

}