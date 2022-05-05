package com.dsajavarev;

import java.util.Arrays;

public class MinimumElementInSortedArray {
    public static void main(String[] args) {
        int N = 5;
        int[] arr = {4 ,5 ,1 ,2 ,3};
    }
    public static int findMin(int[] arr, int n)
    {
        //complete the function here\
        Arrays.sort(arr);
        return arr[0];
    }
}
