package org.example.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RotateImageTest {
    public static final int[][] MATRIX = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    public static final int[][] MATRIX_ROTATED = new int[][]{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};

    @Test
    public void ShouldRotateImage() {
        Assertions.assertArrayEquals(MATRIX_ROTATED, RotateImage.rotateImage(MATRIX));
    }
}