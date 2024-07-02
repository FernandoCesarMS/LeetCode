package hashing;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThreeConsecutiveOddsTest {

    @ParameterizedTest
    @MethodSource(value = "provideTestCases")
    void givenTestCases_provideExpectedAnswers(int[] input, boolean expectedAnswer) {
        boolean answer = ThreeConsecutiveOdds.threeConsecutiveOdds(input);
        assertEquals(expectedAnswer, answer);
    }

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(new int[]{1,2,1,1}, false),
                Arguments.of(new int[]{2,6,4,1}, false),
                Arguments.of(new int[]{1,2,34,3,4,5,7,23,12}, true)
        );
    }

}