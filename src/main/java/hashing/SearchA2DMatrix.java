package hashing;

/*
You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.

Example 1:
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true

Example 2:
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false


https://leetcode.com/problems/single-number/description/?envType=study-plan-v2&envId=top-100-liked

*/

public class SearchA2DMatrix {

    public static final int MINIMAL_VALUE = -10000;

    public static boolean searchMatrix(int[][] matrix, int target) {
        int actualNumber = matrix[0][0];
        int rowActual = 0;
        int columnActual = 0;

        while (actualNumber < target) {
            int numberBellow = hasElementInBellow(matrix, rowActual) ? matrix[rowActual + 1][columnActual] : MINIMAL_VALUE;
            int numberRight = hasElementInRight(matrix, columnActual) ? matrix[rowActual][columnActual + 1] : MINIMAL_VALUE;

            if (numberBellow == MINIMAL_VALUE && numberRight == MINIMAL_VALUE) {
                break;
            }

            if (numberBellow <= target && numberRight <= target || numberBellow == MINIMAL_VALUE || numberRight == MINIMAL_VALUE) {
                actualNumber = Integer.max(numberBellow, numberRight);
            } else {
                actualNumber = Integer.min(numberBellow, numberRight);
            }

            if (actualNumber == numberBellow) {
                rowActual++;
            } else {
                columnActual++;
            }
        }
        return actualNumber == target;
    }

    private static boolean hasElementInRight(int[][] matrix, int columnActual) {
        return columnActual + 1 < matrix[0].length;
    }

    private static boolean hasElementInBellow(int[][] matrix, int rowActual) {
        return rowActual + 1 < matrix.length;
    }
}