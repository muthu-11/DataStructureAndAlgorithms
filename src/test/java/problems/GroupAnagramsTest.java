package problems;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static problems.GroupAnagrams.groupAnagrams;

class GroupAnagramsTest {

    @Test
    void groupAnagrams_ReturnGroupedList_WhenAnagrams() {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> groups = groupAnagrams(strs);
        assertEquals(3, groups.size());
    }
}