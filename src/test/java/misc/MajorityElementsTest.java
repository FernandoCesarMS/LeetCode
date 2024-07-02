package misc;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MajorityElementsTest {

    @ParameterizedTest
    @MethodSource(value = "provideTestCases")
    void givenTestCases_provideExpectedAnswers(int[] input, int expectedAnswer) {
        int answer = MajorityElements.majorityElement(input);
        assertEquals(expectedAnswer, answer);
    }

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(new int[]{3,2,3}, 3),
                Arguments.of(new int[]{2,2,1,1,1,2,2}, 2)
        );
    }
}