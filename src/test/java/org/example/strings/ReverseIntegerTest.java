package org.example.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseIntegerTest {
    private static final int NUMBER = 123;
    private static final int NEGATIVE_NUMBER = -123;
    private static final int NUMBER_REVERSED = 321;
    private static final int NEGATIVE_NUMBER_REVERSED = -321;
    private static final int NUMBER_BIG = Integer.MAX_VALUE;




    @Test
    public void shouldReverseTheNumber() {

        Assertions.assertEquals(NUMBER_REVERSED, ReverseInteger.reverseInteger(NUMBER));

    }

    @Test
    public void shouldReverseTheNegativeNumber() {

        Assertions.assertEquals(NEGATIVE_NUMBER_REVERSED, ReverseInteger.reverseInteger(NEGATIVE_NUMBER));

    }

    @Test
    public void shouldReverseTheBigNumber() {

        Assertions.assertEquals(NEGATIVE_NUMBER_REVERSED, ReverseInteger.reverseInteger(NEGATIVE_NUMBER));

    }
}