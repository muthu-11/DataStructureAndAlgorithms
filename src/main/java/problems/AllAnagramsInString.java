package problems;

import java.util.*;

//https://leetcode.com/problems/find-all-anagrams-in-a-string/
public class AllAnagramsInString {

    //Approach 1 : Using HashMap as Aux memory
    static List<Integer> findAnagrams(String s, String p) {

        List<Integer> anagramIndices = new ArrayList<>();

        if(p.length() > s.length())
            return anagramIndices;

        Map<Character, Integer> needed = new HashMap<>(26);
        Map<Character, Integer> have = new HashMap<>(26);

        for(int i=0; i<p.length(); i++) {
            needed.put(p.charAt(i), needed.getOrDefault(p.charAt(i), 0) + 1);
            have.put(s.charAt(i), have.getOrDefault(s.charAt(i), 0) +1);
        }


        for(int position=p.length(); position<s.length(); position++){

            if(have.equals(needed))
                anagramIndices.add(position - p.length());

            //Add the current char into the have hash
            have.put(s.charAt(position), have.getOrDefault(s.charAt(position),0) + 1);

            //Remove the first char from the hash
            char ch = s.charAt(position - p.length());
            have.put(ch, have.get(ch) - 1);
            if(have.get(ch) == 0)
                have.remove(ch);
        }

        if(have.equals(needed))
            anagramIndices.add(s.length() - p.length());

        return anagramIndices;
    }

    //Approach 2 : Using Array as Aux memory
    static List<Integer> findAnagrams2(String s, String p) {

        List<Integer> anagramIndices = new ArrayList<>();

        if(p.length() > s.length())
            return anagramIndices;

        int[] pCount = new int[26];
        int[] sCount = new int[26];

        for(int i=0; i < p.length(); i++){
            pCount[p.charAt(i) - 'a']++;
            sCount[s.charAt(i) - 'a']++;
        }

        for(int position=p.length(); position<s.length(); position++){

            if(Arrays.equals(pCount, sCount))
                anagramIndices.add(position - p.length());

            // Expand the window by one char
            sCount[s.charAt(position) - 'a']++;

            // Shrink the window by one char
            sCount[s.charAt(position - p.length()) - 'a']--;
        }

        if(Arrays.equals(pCount, sCount))
            anagramIndices.add(s.length() - p.length());

        return anagramIndices;

    }

}
