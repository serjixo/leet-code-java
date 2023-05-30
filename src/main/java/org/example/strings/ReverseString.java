package org.example.strings;

public class ReverseString {

    /*
        Reverse String

        Solution
        Write a function that reverses a string. The input string is given as an array of characters s.

        You must do this by modifying the input array in-place with O(1) extra memory.


        Example 1:

        Input: s = ["h","e","l","l","o"]
        Output: ["o","l","l","e","h"]
        Example 2:

        Input: s = ["H","a","n","n","a","h"]
        Output: ["h","a","n","n","a","H"]


        Constraints:

        1 <= s.length <= 105
        s[i] is a printable ascii character.
    */

    public static char[] reverseString(char[] stringToReverse) {

        int endIndex = stringToReverse.length -1;
        
        for (int startindex = 0; startindex < endIndex; startindex++) {
            char valueHolder =  stringToReverse[startindex];
            stringToReverse[startindex] = stringToReverse[endIndex];
            stringToReverse[endIndex] = valueHolder;
            endIndex--;
        }

        return stringToReverse;

    }


}
