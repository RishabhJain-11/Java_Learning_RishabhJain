package com.recursion;

import java.util.Arrays;

public class RecursionBubbleSort {
    public static void main(String[] args) {

        int[] arr = {45,342,5562,24,34,365,28};
        bubbleSort(arr, arr.length);
        System.out.print("Sorted array = ");
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr, int n){
        if(n == 1){
            return;
        }//base case
        for (int i = 0; i < n-1; i++)
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }//this is used for one pass of bubble sort after this pass the largest element moves onto the bubbled end

        bubbleSort(arr,n-1);//largest element is fixed , move on to the recur part
    }
}
