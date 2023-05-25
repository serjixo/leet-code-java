package org.example.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MoveZeroesTest {
    private final int[] HAS_ONE_ZERO = {0};
    private final int[] HAS_ONE_LEADING_ZERO = {0, 1};
    private final int[] HAS_NO_ZERO = {1};
    private final int[] HAS_ZERO_AT_END = {1, 0};

    @Test
    public void shouldReturnWithTheSameArrayOfOneZero() {
        Assertions.assertArrayEquals(HAS_ONE_ZERO, MoveZeroes.moveZeroes(HAS_ONE_ZERO));
    }

    @Test
    public void shouldReturnArrayOfOrdered() {
        Assertions.assertArrayEquals(HAS_ZERO_AT_END, MoveZeroes.moveZeroes(HAS_ONE_LEADING_ZERO));
    }

}