package misc;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CrawlerLogFolderTest {

    @ParameterizedTest
    @MethodSource(value = "provideTestCases")
    void givenTestCases_provideExpectedAnswers(String[] logs, int expectedAnswer) {
        int answer = CrawlerLogFolder.minOperations(logs);
        assertEquals(expectedAnswer, answer);
    }

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(new String[]{"d1/","d2/","../","d21/","./"}, 2),
                Arguments.of(new String[]{"d1/","d2/","./","d3/","../","d31/"}, 3),
                Arguments.of(new String[]{"d1/","../","../","../"}, 0)
        );
    }
}