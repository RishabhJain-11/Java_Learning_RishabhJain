package com.javawithrmj.TECHIEDELIGHT;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] X = { 0, 2, 0, 3, 0, 5, 6, 0, 0};
        int[] Y = { 1, 8, 9, 10, 15 };

        rearrange(X,Y);
        System.out.println(Arrays.toString(X));
    }

    private static void merge (int[] X,int[] Y,int m,int n){
        int k = m+n+1;
        while(m >= 0 && n >= 0){
            if(X[m] > Y[n]){
                X[k--] = X[m--];
            }
            else {
                X[k--] = X[n--];
            }
        }
        while(n>=0){
            X[k--] = Y[n--];
        }
        Arrays.fill(Y,0);
    }

    public static void rearrange(int[] X,int[] Y){
        if (X.length == 0){
            return ;
        }
        int k = 0;

        for (int value : X){
            if(value != 0){
                X[k++] = value;
            }
        }
        merge(X,Y,k-1,Y.length-1);
    }
}
