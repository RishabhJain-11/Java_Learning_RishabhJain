package com.javawithrmj.TECHIEDELIGHT;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 8, 4, 1, 9, -2 };
//        sortiterative(arr);
        sortRecursive(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortiterative(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
                swap(arr,min,i);
        }
    }
/*
Both the worst-case and best-case time complexity of selection sort is O(n2), where n is the input size, and it doesn’t require any extra space.
 */
    static void sortRecursive(int[] arr,int i, int n){
            int min = i;
        for (int j = i+1; j < n; j++) {
            if (arr[j] < arr[min]){
                min = j;
            }
        }
        swap(arr,min,i);
        if (i+1 < n){
            sortRecursive(arr,i+1,n);
        }
    }
    /*
    The time complexity of the selection sort recursive algorithm remains the same as the iterative version.
    However, the auxiliary space used by the recursive version is O(n) for the call stack.
     */
}
