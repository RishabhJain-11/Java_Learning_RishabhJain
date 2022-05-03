package com.dsajavarev;

import java.util.Arrays;

public class KthSmallestElement {
    public static void main(String[] args) {
        int N = 6;
        int[] arr = {7 ,10 ,4 ,3 ,20 ,15};
        int K = 3;
//        System.out.println(kthSmallest(arr,N,K));
    }
    public static int kthSmallest(int[] arr, int l, int r, int k)
    {
        //Your code here
        Arrays.sort(arr);
        return arr[k-1];
    }
}
