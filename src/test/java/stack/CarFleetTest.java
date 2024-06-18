package stack;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarFleetTest {

    @ParameterizedTest
    @MethodSource(value = "provideTestCases")
    void testDailyTemperatures(int target, int[] positions, int[] speeds, int expectedAnswer) {
        int answer = CarFleet.carFleet(target, positions, speeds);
        assertEquals(expectedAnswer, answer);
    }

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(12, new int[]{10,8,0,5,3}, new int[]{2,4,1,1,3}, 3),
                Arguments.of(10, new int[]{6,8}, new int[]{3,2}, 2),
                Arguments.of(10, new int[]{3}, new int[]{3}, 1),
                Arguments.of(100, new int[]{0,2,4}, new int[]{4,2,1}, 1),
                Arguments.of(13, new int[]{10,2,5,7,4,6,11}, new int[]{7,5,10,5,9,4,1}, 2),
                Arguments.of(20, new int[]{15,4,10,12,17,19,11,14,6,0,2}, new int[]{4,8,1,2,8,8,10,7,10,8,6}, 5),
                Arguments.of(31, new int[]{5,26,18,25,29,21,22,12,19,6}, new int[]{7,6,6,4,3,4,9,7,6,4}, 6)
        );
    }

}