package coding.challenges;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static coding.challenges.SubstringConcatenationOfAllWords.findSubstring;

class SubstringConcatenationOfAllWordsTest {


    @Test
    void findSubstringTest1() {
        String s = "barfoothefoobarman";
        String[] words = {"foo","bar"};

        List<Integer> result = findSubstring(s, words);
        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(9);
        assertEquals(expected, result);
    }

    @Test
    void findSubstringTest2() {
        String s = "wordgoodgoodgoodbestword";
        String[] words = {"word","good","best","word"};

        List<Integer> result = findSubstring(s, words);
        assertEquals(new ArrayList<Integer>(), result);
    }

    @Test
    void findSubstringTest3() {
        String s = "barfoofoobarthefoobarman";
        String[] words = {"bar","foo","the"};

        List<Integer> result = findSubstring(s, words);
        List<Integer> expected = new ArrayList<>();
        expected.add(6);
        expected.add(9);
        expected.add(12);
        assertEquals(expected, result);
    }

    @Test
    void findSubstringTest4() {
        String s = "wordgoodgoodgoodbestword";
        String[] words = {"word","good","best","good"};

        List<Integer> result = findSubstring(s, words);
        List<Integer> expected = new ArrayList<>();
        expected.add(8);
        assertEquals(expected, result);
    }

    @Test
    void findSubstringTest5() {
        String s = "lingmindraboofooowingdingbarrwingmonkeypoundcake";
        String[] words = {"fooo","barr","wing","ding","wing"};

        List<Integer> result = findSubstring(s, words);
        List<Integer> expected = new ArrayList<>();
        expected.add(13);
        assertEquals(expected, result);
    }

}