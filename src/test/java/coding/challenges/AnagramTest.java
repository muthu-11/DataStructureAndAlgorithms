package coding.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void isAnagram_ReturnFalse_WithDifferentLengths(){
        assertFalse(Anagram.isAnagram("silent", "list"));
    }

    @Test
    void isAnagram_ReturnFalse_WhenStringIsEmpty(){
        assertFalse(Anagram.isAnagram("", ""));
    }

    @Test
    void isAnagram_ReturnFalse_WhenStringIsNull(){
        assertFalse(Anagram.isAnagram(null, ""));
    }

    @Test
    void isAnagram_ReturnFalse_WhenNotAnagrams(){
        assertFalse(Anagram.isAnagram2("aacc", "ccac"));
    }

    @Test
    void isAnagram_ReturnTrue_WhenAnagrams() {
        assertAll(
                () -> assertTrue(Anagram.isAnagram2("silent","listen")),
                () -> assertTrue(Anagram.isAnagram2("Silent","Listen")),
                () -> assertTrue(Anagram.isAnagram2("Bored","Robed")),
                () -> assertTrue(Anagram.isAnagram2("Mother In Law", "Hitler Woman"))
        );

    }

}