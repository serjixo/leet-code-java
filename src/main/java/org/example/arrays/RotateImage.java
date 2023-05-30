package org.example.arrays;

public class RotateImage {

    /*
        You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

        You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.



        Example 1:


        Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
        Output:         [[7,4,1],[8,5,2],[9,6,3]]

    */

    public static int[][] rotateImage(int[][] matrix) {

        int[][] matrixSnapshot = cloneTwoDimensionalArray(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = matrixSnapshot[matrix.length - 1 - j][i];
            }
        }

        return matrix;
    }

    private static int[][] cloneTwoDimensionalArray(int[][] matrix) {
        int[][] matrixSnapshot = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrixSnapshot[i][j] = matrix[i][j];
            }
        }
        return matrixSnapshot;
    }

}
