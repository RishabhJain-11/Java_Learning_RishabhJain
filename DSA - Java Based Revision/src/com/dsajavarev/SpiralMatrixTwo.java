package com.dsajavarev;
//https://leetcode.com/problems/spiral-matrix-ii/
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
            for (int i = colStart; i <= colEnd; i ++) {//yeh start of row to the end of row tak jayega .
                matrix[rowStart][i] = num ++; //change : yeh row ke liye bana hai
            }
            rowStart ++;// agar row ke niche jana hai toh aapko use rowstart++ karna padega kyunki rows ka o-indexing hai

            for (int i = rowStart; i <= rowEnd; i ++) {//ye columns ke andar ke liye usme niche jane ke liye hai
                matrix[i][colEnd] = num ++; //change: ye downwards direction me move karega.
            }
            colEnd --;//row ko badalne ke liye.

            for (int i = colEnd; i >= colStart; i --) {//
                if (rowStart <= rowEnd)//last row me left traversal karne ke liye bana hai.
                    matrix[rowEnd][i] = num ++; //change : pura left traverse karega.
            }
            rowEnd --;//upar jane ke liye.

            for (int i = rowEnd; i >= rowStart; i --) {
                if (colStart <= colEnd)
                    matrix[i][colStart] = num ++; //change
            }
            colStart ++;
        }

        return matrix;
    }
}
