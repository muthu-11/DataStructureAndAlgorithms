package problems;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    static boolean isAnagram(String s1, String s2){

        if(s1 == null || s2 == null)
            return false;

        s1 = s1.toLowerCase().replaceAll("\\s", "");
        s2 = s2.toLowerCase().replaceAll("\\s", "");

        if(s1.length() == 0 || s2.length() == 0 || s1.length() != s2.length())
            return false;

        Map<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s1.length(); i++){
            char ch = s1.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(int i=0; i<s2.length(); i++){
            char ch = s2.charAt(i);
            if(!map.containsKey(ch))
                return false;
            map.put(ch, map.get(ch) - 1);
        }

        return true;
    }

}
