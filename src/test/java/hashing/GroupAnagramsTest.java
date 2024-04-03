package hashing;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramsTest {
    @Test
    void example1() {
        String[] inputs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> response = GroupAnagrams.groupAnagrams(inputs);

        List<List<String>> expectedResponse = new ArrayList<>();
        expectedResponse.add(List.of("eat","tea","ate"));
        expectedResponse.add(List.of("bat"));
        expectedResponse.add(List.of("tan","nat"));

        assertEquals(expectedResponse, response);
    }

    @Test
    void example2() {
        String[] inputs = {""};
        List<List<String>> response = GroupAnagrams.groupAnagrams(inputs);

        List<List<String>> expectedResponse = new ArrayList<>();
        expectedResponse.add(List.of(""));

        assertEquals(expectedResponse, response);
    }

    @Test
    void example3() {
        String[] inputs = {"a"};
        List<List<String>> response = GroupAnagrams.groupAnagrams(inputs);

        List<List<String>> expectedResponse = new ArrayList<>();
        expectedResponse.add(List.of("a"));

        assertEquals(expectedResponse, response);
    }
}