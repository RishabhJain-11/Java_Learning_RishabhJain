package com.dsajavarev;

public class SearchInMatrix {
    public static void main(String[] args) {
        int N = 3, M = 3;
        int[][] mat = {{3, 30, 38},
                       {44, 52, 54},
                       {57, 60, 69}};
        int X = 62;
        System.out.println(matSearch(mat,N,M,X));
    }
    public static int matSearch(int[][] mat, int N, int M, int X)
    {
        // your code here
        int k = 0;
        for(int[] i : mat){
            for(int j : i){
                if(j == X){
                    k = 1;
                }
                else if(j > X){
                    break;
                }
            }
        }
        return k;
    }
}
