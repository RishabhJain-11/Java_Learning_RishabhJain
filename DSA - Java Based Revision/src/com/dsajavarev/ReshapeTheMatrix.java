package com.dsajavarev;

import java.util.Arrays;

public class ReshapeTheMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2},{3,4}};
        int r = 1;
        int c = 4;
        System.out.println(Arrays.deepToString(matrixReshape(mat, r, c)));
    }
    public static int[][] matrixReshape(int[][] mat, int r, int c){
        int n = mat.length;
        int m = mat[0].length;
        if(r*c != m*n){
            return mat;
        }
        int[][] res = new int[r][c];

        for(int i = 0;i < r*c;i++){
            res[i/c][i%c] = mat[i/m][i%m];
        }
        return res;
    }
}
