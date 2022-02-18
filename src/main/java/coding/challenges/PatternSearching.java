package coding.challenges;

import java.util.ArrayList;
import java.util.List;

//https://www.geeksforgeeks.org/kmp-algorithm-for-pattern-searching/
public class PatternSearching {


    //Naive approach. Time complexity O(M * (N-M))
    static List<Integer> getPatternMatchingIndices(String string, String pattern){

        List<Integer> indices = new ArrayList<>();

        if(pattern.length() > string.length())
            return indices;

        //O(N-M)
        for(int index = 0; index < string.length() - pattern.length(); index++){
            int position;

            //O(M)
            for(position = 0; position < pattern.length(); position++)
                if(string.charAt(index + position) != pattern.charAt(position))
                    break;

            if(position == pattern.length())
                indices.add(index);

        }

        return indices;
    }

}

