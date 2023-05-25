package org.example.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class TwoSumTest {
    private final static int[] HAS_TWO_TWOS = {2, 2};
    private final static int FOUR = 4;

    @Test
    public void shouldReturnIndexOfTwoElemtnsThatADDToTarget() {
        Arrays.equals(new int[]{0, 1}, TwoSum.twoSum(HAS_TWO_TWOS, FOUR));
    }

}