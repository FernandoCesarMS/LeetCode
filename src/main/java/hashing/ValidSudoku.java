package hashing;

/*
Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.

Note:

A Sudoku board (partially filled) could be valid but is not necessarily solvable.
Only the filled cells need to be validated according to the mentioned rules.

https://leetcode.com/problems/valid-sudoku/description/

*/

import java.util.HashSet;

public class ValidSudoku {

    public static final int BOARD_SIZE = 9;

    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < BOARD_SIZE; i++) {
            boolean isValidRow = isValidRow(board[i]);
            if (!isValidRow) {
                return false;
            }

            for(int j = 0; j < BOARD_SIZE; j++) {
                boolean isValid = isValidColumn(board, j) && isValidSubBoxes(board, i, j);
                if (!isValid) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean isValidRow(char[] row) {
        HashSet<Character> caracters = new HashSet<>();

        for (char caracter : row) {
            if (caracter != '.' && !caracters.add(caracter)) {
                return false;
            }
        }

        return true;
    }

    public boolean isValidColumn(char[][] board, int column) {
        char[] columnConvertedToRow = new char[BOARD_SIZE];
        for(int i = 0; i < BOARD_SIZE; i++) {
            columnConvertedToRow[i] = board[i][column];
        }

        return isValidRow(columnConvertedToRow);
    }

    public boolean isValidSubBoxes(char[][] board, int row, int column) {
        int[] subBoxesPossiblesBegins = new int[]{0,3,6};

        int beginSubBoxesRow = subBoxesPossiblesBegins[row % 3];
        int endSubBoxesRow = beginSubBoxesRow + 2;
        int beginSubBoxesColumn = subBoxesPossiblesBegins[column % 3];
        int endSubBoxesColumn = beginSubBoxesColumn + 2;

        char[] subBoxesConvertedToRow = new char[BOARD_SIZE];
        int actualPosition = 0;
        for(int i = beginSubBoxesRow; i <= endSubBoxesRow; i++) {
            for(int j = beginSubBoxesColumn; j <= endSubBoxesColumn; j++) {
                subBoxesConvertedToRow[actualPosition] = board[i][j];
                actualPosition++;
            }
        }

        return isValidRow(subBoxesConvertedToRow);
    }
}