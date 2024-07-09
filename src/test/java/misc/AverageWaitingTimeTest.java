package misc;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class AverageWaitingTimeTest {

    @ParameterizedTest
    @MethodSource(value = "provideTestCases")
    void givenTestCases_provideExpectedAnswers(int[][] customers, double expectedAnswer) {
        double answer = AverageWaitingTime.averageWaitingTime(customers);
        assertEquals(expectedAnswer, answer);
    }

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(new int[][]{{1,2},{2,5},{4,3}}, 5.0),
                Arguments.of(new int[][]{{5,2},{5,4},{10,3},{20,1}}, 3.25)
        );
    }

}