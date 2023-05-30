package org.example.arrays;

import java.util.HashSet;

public class SudokuValidator {

    /*
        Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

        Each row must contain the digits 1-9 without repetition.
        Each column must contain the digits 1-9 without repetition.
        Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
        Note:

        A Sudoku board (partially filled) could be valid but is not necessarily solvable.
        Only the filled cells need to be validated according to the mentioned rules.


     */

    public static boolean sudokuValidator(char[][] board) {
        HashSet<String> seen = new HashSet();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char currentVal = board[i][j];
                if (currentVal != '.') {
                    if (!seen.add(currentVal + " found in row " + i) ||
                            !seen.add(currentVal + " found in column " + j) ||
                            !seen.add(currentVal + " fund in sub box " + i / 3 + "-" + j / 3)) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}



