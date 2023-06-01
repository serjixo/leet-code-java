package org.example.strings;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueChar {

    /*
     First Unique Character in a String

        Solution
        Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.



        Example 1:

        Input: s = "leetcode"
        Output: 0
        Example 2:

        Input: s = "loveleetcode"
        Output: 2
        Example 3:

        Input: s = "aabb"
        Output: -1


        Constraints:

        1 <= s.length <= 105
        s consists of only lowercase English letters.
    */

    public static int firstUniqueChar(String text) {

        Map<Character, Integer> uniqueChars = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            if (uniqueChars.putIfAbsent(character, i) != null) {
                uniqueChars.put(character, -1);
            }
        }

        int min = text.length();

        for (int uniqueCharIndex : uniqueChars.values()) {
            if (uniqueCharIndex < min && uniqueCharIndex != -1) {
                min = uniqueCharIndex;
            }
        }
        
        return min == text.length() ? -1 : min;

    }


}
