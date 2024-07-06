package misc;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PassPillowTest {

    @ParameterizedTest
    @MethodSource(value = "provideTestCases")
    void givenTestCases_provideExpectedAnswers(int n, int time, int expectedAnswer) {
        int answer = PassPillow.passThePillow(n, time);
        assertEquals(expectedAnswer, answer);
    }

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(2, 2, 1),
                Arguments.of(26, 1000, 1),
                Arguments.of(2, 341, 2),
                Arguments.of(18, 38, 5),
                Arguments.of(4, 5, 2),
                Arguments.of(3, 2, 3)
        );
    }

}