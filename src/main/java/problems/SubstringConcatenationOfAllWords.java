package problems;

import java.util.*;

//https://leetcode.com/problems/substring-with-concatenation-of-all-words/
public class SubstringConcatenationOfAllWords {

    static List<Integer> findSubstring(String s, String[] words) {

        List<Integer> indices = new ArrayList<>();

        if(words.length ==0)
            return indices;

        int wLen = words[0].length();
        int pCharLen = wLen * words.length;

        Map<String, Integer> need = new HashMap<>();

        for(String word: words)
            need.put(word, need.getOrDefault(word,0) + 1);

        for(int i=0; i <= s.length() - pCharLen; i++){
            if(need.containsKey(s.substring(i, i+wLen))){
                Map<String, Integer> have = new HashMap<>();
                 for (int j = 0; j < words.length; j++) {
                    int start = i + j *wLen;
                    String w = s.substring(start, start + wLen);
                    have.put(w, have.getOrDefault(w, 0) + 1);
                }
                if(need.equals(have)) indices.add(i);
            }
        }
        return indices;
    }

// O(M) + O(N*M);
//    List<Integer> indices = new ArrayList<>();
//
//    Map<String, Integer> need = new HashMap<>();
//    Map<String, Integer> have = new HashMap<>();
//
//        if(words.length ==0)
//            return indices;
//
//    int wordLength = words[0].length();
//
//    int totalWords = s.length()/wordLength;
//
//        for(int i=0; i<words.length; i++) {
//        need.put(words[i], need.getOrDefault(words[i], 0) + 1);
//        int start = i * wordLength;
//        String substring = s.substring(start, start + wordLength);
//        have.put(substring, have.getOrDefault(substring, 0)+1);
//    }
//
//        System.out.println(need);
//
//    int processedWords = words.length;
//
//    int processedIndex = words.length * wordLength;
//        while(processedWords < totalWords){
//        int currentIndex = processedWords * wordLength;
//        if(need.equals(have))
//            indices.add(currentIndex - processedIndex);
//
//        String nextWord = s.substring(currentIndex, currentIndex + wordLength);
//        have.put(nextWord, have.getOrDefault(nextWord, 0) + 1);
//
//        String startWord = s.substring(currentIndex - processedIndex, currentIndex -processedIndex + wordLength);
//        have.put(startWord, have.getOrDefault(startWord, 0) - 1);
//        if(have.get(startWord) == 0)
//            have.remove(startWord);
//
//        processedWords++;
//    }
//
//        if(need.equals(have))
//            indices.add(s.length() - processedIndex);
//
//        return indices;

}
