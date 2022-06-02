package com.dsajavarev;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
      int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
      System.out.println(Arrays.deepToString(transposeMatrix(matrix)));
    }

//    public static int[][] transposeMatrix(int[][] a){
//        int m = a.length;
//        int n = a[0].length;
//        int[][] b = new int[n][m];
//        for (int j = 0;j < n;j++){
//            for(int i = 0 ;i< m;i++){
//                b[j][i] = a[i][j];
//            }
//        }
//        return b;
//    }

    public static int[][] transposeMatrix(int[][] a){
        int m = a.length;
        int n = a[0].length;
        int [][] b = new int[n][m];
        for(int j = 0;j<n;j++)
            for(int i = 0;i < m;i++){
                b[j][i] = a[i][j];
            }
        return b;
    }
}
