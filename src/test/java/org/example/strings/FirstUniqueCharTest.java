package org.example.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FirstUniqueCharTest {
    private final static String UNIQUE_IN_ZERO = "lee";
    private final static String MULTIPLE_UNIQUE = "leetcod";
    private final static String UNIQUE_NON_PAIR_REPETITIONS = "leee";

    private final static String NON_UNIQUE = "aabb";

    @Test
    public void ShouldReturnIndexOfFirstUniqueChar() {
        Assertions.assertEquals(0, FirstUniqueChar.firstUniqueChar(UNIQUE_IN_ZERO));
    }

    @Test
    public void ShouldReturnIndexOfFirstUniqueCharWhenMultipliUnique() {
        Assertions.assertEquals(0, FirstUniqueChar.firstUniqueChar(MULTIPLE_UNIQUE));
    }

    @Test
    public void ShouldReturnMinusONeForNonUniqueChars() {
        Assertions.assertEquals(-1, FirstUniqueChar.firstUniqueChar(NON_UNIQUE));
    }

}