package queue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstUniqueCaracterInStringTest {

    @ParameterizedTest
    @MethodSource(value = "provideTestCases")
    void givenTestCases_provideExpectedAnswers(String input, int expectedAnswer) {
        int answer = FirstUniqueCaracterInString.firstUniqChar(input);
        assertEquals(expectedAnswer, answer);
    }

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of("aabb", -1),
                Arguments.of("leetcode", 0),
                Arguments.of("loveleetcode", 2)
        );
    }
}