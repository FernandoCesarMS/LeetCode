package misc;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FindDuplicateNumberTest {
    @ParameterizedTest
    @MethodSource(value = "provideTestCases")
    void givenTestCases_provideExpectedAnswers(int[] input, int expectedAnswer) {
        int answer = FindDuplicateNumber.findDuplicate(input);
        assertEquals(expectedAnswer, answer);
    }

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(new int[]{1,3,4,2,2}, 2),
                Arguments.of(new int[]{3,1,3,4,2}, 3),
                Arguments.of(new int[]{3,3,3,3,3}, 3)
        );
    }
}