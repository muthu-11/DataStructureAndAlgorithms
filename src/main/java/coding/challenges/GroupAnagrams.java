package coding.challenges;

import java.util.*;

//https://leetcode.com/problems/group-anagrams/
public class GroupAnagrams {

    static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> groups = new HashMap<>();

        List<List<String>> results = new ArrayList<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            groups.putIfAbsent(key, new ArrayList<>());
            groups.get(key).add(str);
        }

        for(String key : groups.keySet())
            results.add(groups.get(key));

        return results;
    }

}
