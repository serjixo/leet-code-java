package org.example.strings;

public class ReverseInteger {

    /*
      Reverse Integer

        Solution
        Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

        Assume the environment does not allow you to store 64-bit integers (signed or unsigned).



        Example 1:

        Input: x = 123
        Output: 321
        Example 2:

        Input: x = -123
        Output: -321
        Example 3:

        Input: x = 120
        Output: 21


    */

    public static int reverseInteger(int numToReverse) {

            boolean isNegative = false;

        if (numToReverse < 0) {
            isNegative = true;
            numToReverse = numToReverse * -1;
        }
        char[] charsToReverse = String.valueOf(numToReverse).toCharArray();

        for (int i = 0; i < charsToReverse.length / 2; i++) {
            char temp = charsToReverse[i];
            charsToReverse[i] = charsToReverse[charsToReverse.length - i - 1];
            charsToReverse[charsToReverse.length - i - 1] = temp;
        }

        try {
            if (isNegative) {
                return Integer.parseInt(String.valueOf(charsToReverse)) * -1;
            }
            return Integer.parseInt(String.valueOf(charsToReverse));
        } catch (NumberFormatException e) {
            return 0;
        }

    }

}
