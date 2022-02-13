package problems;

import java.util.Arrays;

//https://leetcode.com/problems/permutation-in-string/
public class SubstringPermutation {

    static boolean checkInclusion(String s1, String s2) {

        if(s2.length() < s1.length())
            return false;

        int[] s1CharCounts = new int[26];
        int[] s2CharCounts = new int[26];

        for(int i=0; i<s1.length(); i++){
            s1CharCounts[s1.charAt(i) - 'a']++;
            s2CharCounts[s2.charAt(i) - 'a']++;
        }

        for(int pos = s1.length(); pos < s2.length(); pos++){

            if(Arrays.equals(s1CharCounts, s2CharCounts))
                return true;

            s2CharCounts[s2.charAt(pos) - 'a']++;

            s2CharCounts[s2.charAt(pos - s1.length()) - 'a']--;

        }

        return Arrays.equals(s1CharCounts, s2CharCounts);
    }

}
