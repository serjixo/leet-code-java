package org.example.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PlusOneTest {
    private static final int[] ZERO_ARRAY = {0};
    private static final int[] NINE_ARRAY = {9};

    private static final int[] TEN_ARRAY = {1, 0};
    private static final int[] NINES_AT_END_ARRAY = {1, 2, 9, 9, 9};
    private static final int[] NINES_AT_END_ARRAY_PLUS_ONE = {1, 3, 0, 0, 0};

    @Test
    public void shouldSumOneToAZeroArray() {
        Assertions.assertArrayEquals(new int[]{1}, PlusOne.plusOne(ZERO_ARRAY));
    }

    @Test
    public void shouldSumOneToANineArray() {
        Assertions.assertArrayEquals(new int[]{1, 0}, PlusOne.plusOne(NINE_ARRAY));
    }

    @Test
    public void shouldSumOneToATenArray() {
        Assertions.assertArrayEquals(new int[]{1, 1}, PlusOne.plusOne(TEN_ARRAY));
    }

    @Test
    public void shouldSumOneToAnArrayWithMultipleninesAtTheEnd() {
        Assertions.assertArrayEquals(NINES_AT_END_ARRAY_PLUS_ONE, PlusOne.plusOne(NINES_AT_END_ARRAY));
    }



}