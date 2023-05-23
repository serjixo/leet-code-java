package org.example.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IntersectionMultipleTest {
    private static final int[] HAS_ONE = {1, 5, 6};
    private static final int[] HAS_ONE_TWO_TIMES = {1, 1, 3, 4};

    private static final int[] HAS_NOT_ONE = {0, 0, 0, 0};
    private static final int[] HAS_TWO_TWOS_AND_MORE = {1, 2, 2, 1};
    private static final int[] HAS_TWO_TWOS = {2, 2};
    private static final int[] HAS_ONE_TWO = {2};



    @Test
    public void ShouldReturnAnEmptyArrayIfThereAreNotDuplicates() {
        Assertions.assertArrayEquals(new int[0], IntersectionMultiple.intersectionMultiple(HAS_ONE, HAS_NOT_ONE));
    }

    @Test
    public void ShouldReturnAnArrayWithOneOne() {
        int[] expectedResult = {1};
        Assertions.assertArrayEquals(expectedResult, IntersectionMultiple.intersectionMultiple(HAS_ONE, HAS_ONE_TWO_TIMES));
    }

    @Test
    public void ShouldReturnAnArrayWithTwoTwos() {
        int[] expectedResult = {2, 2};
        Assertions.assertArrayEquals(expectedResult, IntersectionMultiple.intersectionMultiple(HAS_TWO_TWOS_AND_MORE, HAS_TWO_TWOS));
    }

    @Test
    public void ShouldReturnAnArrayWithOneTwo() {
        int[] expectedResult = {2};
        Assertions.assertArrayEquals(expectedResult, IntersectionMultiple.intersectionMultiple(HAS_TWO_TWOS_AND_MORE, HAS_ONE_TWO));
    }
}