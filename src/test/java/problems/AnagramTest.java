package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void shouldReturnFalseWhenTwoStringsWithDifferentLength(){
        assertFalse(Anagram.isAnagram("silent", "list"));
    }

    @Test
    void shouldReturnFalseWhenAnyOneStringIsEmpty(){
        assertFalse(Anagram.isAnagram("", ""));
    }

    @Test
    void shouldReturnFalseWhenAnyOneStringIsNull(){
        assertFalse(Anagram.isAnagram(null, ""));
    }

    @Test
    void shouldReturnTrueWhenInputStringsAreAnagram() {
        assertTrue(Anagram.isAnagram("silent","listen"));
        assertTrue(Anagram.isAnagram("Silent","Listen"));
        assertTrue(Anagram.isAnagram("Bored","Robed"));
        assertTrue(Anagram.isAnagram("Mother In Law", "Hitler Woman"));
    }

}