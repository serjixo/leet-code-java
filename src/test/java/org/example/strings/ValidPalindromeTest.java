package org.example.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidPalindromeTest {
    private static final String VALID_PALINDROME_WITH_NON_ALPHANUMERIC = "racecar";
    private static final String VALID_PALINDROME_WITH_ALPHANUMERIC = "a man, a plan, a canal: panama";
    private static final String VALID_PALINDROME_WITH_ALPHANUMERIC_AND_CAPITAL = "A man, a plan, a canal: Panama";


    @Test
    public void shouldReturnTrueInaValidPalindrome() {
        Assertions.assertEquals(true, ValidPalindrome.validpalindrome(VALID_PALINDROME_WITH_NON_ALPHANUMERIC));
    }
    @Test
    public void shouldReturnTrueInaValidPalindromeWithAlphaNumeric() {
        Assertions.assertEquals(true, ValidPalindrome.validpalindrome(VALID_PALINDROME_WITH_ALPHANUMERIC));
    }



}