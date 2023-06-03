package org.example.strings;

import java.util.HashMap;
import java.util.HashSet;

public class ValidAnagram {

    /*

     */

    public static boolean validAnagram(String text, String anagram) {

        if (anagram.length() != text.length()) {
            return false;
        }

        HashMap<Character, Integer> textLetters = new HashMap<>();

        for (char letter : text.toCharArray()) {
            addLetterToMap(textLetters, letter);
        }

        for (char anagramLetter : anagram.toCharArray()) {
            if (textLetters.containsKey(anagramLetter)) {
                int numberOfOcurrences = textLetters.get(anagramLetter);
                if (numberOfOcurrences == 1) {
                    textLetters.remove(anagramLetter);
                    continue;
                }
                textLetters.put(anagramLetter, numberOfOcurrences - 1);
            } else {
                return false;
            }
        }
        return textLetters.isEmpty();
    }

    private static void addLetterToMap(HashMap<Character, Integer> textLetters, char letter) {
        if (textLetters.containsKey(letter)) {
            textLetters.put(letter, textLetters.get(letter) + 1);
        } else {
            textLetters.put(letter, 1);
        }
    }


}
