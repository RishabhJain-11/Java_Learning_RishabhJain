package com.dsajavarev;

import java.util.ArrayList;
import java.util.Arrays;

public class StockBuyAndSelf {
    public static void main(String[] args) {
        int N = 7;
        int[] A = {100,180,260,310,40,535,695};
        System.out.println(stockBuySell(A,N));
    }
    public static ArrayList<ArrayList<Integer>> stockBuySell(int[] A, int n) {
        // code here
        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();

        int left = A[0];
        int right = 0;

        for(int i = 1;i < n;i++){
            if(A[i] > left){
                al.add(new ArrayList<Integer>(Arrays.asList(right,i)));
                left = A[i];
                right = i;
            }
            else if(A[i] < left){
                left = A[i];
                right = i;
            }
        }
        return al;
    }
}
