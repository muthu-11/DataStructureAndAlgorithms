package problems;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PatternSearchingTest {


    @Test
    void getPatternMatchingIndices_WhenGivenStringWithPattern_UseCase1() {
        List<Integer> indices = PatternSearching.getPatternMatchingIndices("THIS IS A TEST TEXT", "TEST");
        assertAll(
                () -> assertEquals(10, indices.get(0)),
                () -> assertEquals(1, indices.size())
        );

    }

    @Test
    void getPatternMatchingIndices_WhenGivenStringWithPattern_UseCase2() {
       List<Integer> indices = PatternSearching.getPatternMatchingIndices("AABAACAADAABAAABAA", "AABA");
       assertAll(
               () -> assertEquals(3, indices.size()),
               () -> assertEquals(0, indices.get(0)),
               () -> assertEquals(9, indices.get(1)),
               () -> assertEquals(13, indices.get(2))
       );

    }
}