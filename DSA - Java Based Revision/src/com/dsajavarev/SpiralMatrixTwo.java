package com.dsajavarev;

import java.util.Arrays;

public class SpiralMatrixTwo {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(Arrays.deepToString(generateMatrix(n)));
    }
    public static int[][] generateMatrix(int n) {
        // Declaration
        int[][] matrix = new int[n][n];//n * n ka matrix ban jayega

        // Edge Case
        if (n == 0) {
            return matrix;//base case
        }

        // Normal Case
        int rowStart = 0;// yeh hai row start
        int rowEnd = n-1;// yeh hai row end
        int colStart = 0;// yeh hai column start
        int colEnd = n-1;// yeh hai column end
        int num = 1; //change

        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int i = colStart; i <= colEnd; i ++) {
                matrix[rowStart][i] = num ++; //change
            }
            rowStart ++;

            for (int i = rowStart; i <= rowEnd; i ++) {
                matrix[i][colEnd] = num ++; //change
            }
            colEnd --;

            for (int i = colEnd; i >= colStart; i --) {
                if (rowStart <= rowEnd)
                    matrix[rowEnd][i] = num ++; //change
            }
            rowEnd --;

            for (int i = rowEnd; i >= rowStart; i --) {
                if (colStart <= colEnd)
                    matrix[i][colStart] = num ++; //change
            }
            colStart ++;
        }

        return matrix;
    }
}
