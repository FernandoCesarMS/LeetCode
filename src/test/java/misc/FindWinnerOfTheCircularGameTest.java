package misc;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FindWinnerOfTheCircularGameTest {
    @ParameterizedTest
    @MethodSource(value = "provideTestCases")
    void givenTestCases_provideExpectedAnswers(int n, int k, int expectedAnswer) {
        int answer = FindWinnerOfTheCircularGame.findTheWinner(n , k);
        assertEquals(expectedAnswer, answer);
    }

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(5, 2, 3),
                Arguments.of(388, 281, 176),
                Arguments.of(6, 5, 1)
        );
    }
}