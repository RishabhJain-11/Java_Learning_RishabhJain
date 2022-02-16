package com.recursion;

import java.util.Arrays;

public class InsertionSortRecursion {
    public static void main(String[] args) {
        int [] arr = {12 , 11 , 13 , 5 , 6};
        insertionSortRecursion(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
// Rishabh Jain
    static void insertionSortRecursion(int[] arr , int n){
        if (n<=1)
            return;//Base Case

        insertionSortRecursion(arr,n-1); // sort first n-1 elements

        int last = arr[n-1];//insert last element at its correct position in sorted array
        int j = n - 2 ;


//rishabh jain
        /*
        Move elements of arr[0...ito 1] that are greater than key,
        to one position ahead of their current position
         */
        while (j >= 0 && arr[j] > last){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = last;
    }
}
