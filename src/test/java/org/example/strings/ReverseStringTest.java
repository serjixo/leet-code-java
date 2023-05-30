package org.example.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {
    private final static char[] TEXT =  new char[]{'h','e','l','l','o'};
    private final static char[] TEXT_REVERSED =  new char[]{'o','l','l','e','h'};

    @Test
    public void shouldReverseTheCharsArray(){
        Assertions.assertArrayEquals(TEXT_REVERSED, ReverseString.reverseString(TEXT));
    }

}