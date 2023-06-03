package org.example.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidAnagramTest {
    private static final String WORD = "WORD";
    private static final String WORD_VALID_ANAGRAM = "WDOR";
    private static final String WORD_NOT_VALID_ANAGRAM = "WDOT";
    private static final String WORD_NOT_VALID_ANAGRAM_DIFF_SIZE = "WOT";
    private static final String WORD_NOT_VALID_ANAGRAM_DIFF_FREQUENCIES = "WODD";


    @Test
    public void shouldReturnTrueForValidAnagram() {
        Assertions.assertEquals(true, ValidAnagram.validAnagram(WORD, WORD_VALID_ANAGRAM));
    }

    @Test
    public void shouldReturnFalseForNotValidAnagram() {
        Assertions.assertEquals(false, ValidAnagram.validAnagram(WORD, WORD_NOT_VALID_ANAGRAM));
    }

    @Test
    public void shouldReturnFalseForNotSameSizeAnagram() {
        Assertions.assertEquals(false, ValidAnagram.validAnagram(WORD, WORD_NOT_VALID_ANAGRAM_DIFF_SIZE));
    }

    @Test
    public void shouldReturnFalseForNotSameFrequenciesAnagram() {
        Assertions.assertEquals(false, ValidAnagram.validAnagram(WORD, WORD_NOT_VALID_ANAGRAM_DIFF_FREQUENCIES));
    }

}