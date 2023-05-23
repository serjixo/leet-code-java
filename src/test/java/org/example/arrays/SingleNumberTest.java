package org.example.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SingleNumberTest {
    private static final int[] HAS_ONE_AS_SINGLE = {1, 2, 2, 3, 3};

    @Test
    public void shouldReturnOneWhenIsTheSingleValue() {
        assertEquals(1, SingleNumber.singleNumber(HAS_ONE_AS_SINGLE));
    }

    @Test
    public void shouldReturnOneAsSingle() throws RuntimeException {
        assertEquals(1, SingleNumber.singleNumber(HAS_ONE_AS_SINGLE));
    }
}