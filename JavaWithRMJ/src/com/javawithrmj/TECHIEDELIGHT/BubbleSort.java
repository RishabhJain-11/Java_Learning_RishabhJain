package com.javawithrmj.TECHIEDELIGHT;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 8, 4, 1, 9, -2 };
//        bubbleSortIter(arr);
        bubbleSortRec(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSortIter(int[] a){
        for (int k = 0; k < a.length - 1; k++) {
            for (int i = 0; i < a.length - k - 1; i++) {
                if (a[i] > a[i+1]){
                    swap(a,i,i+1);
                }
            }
        }
    }


    static void bubbleSortRec(int[] a,int n){
        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i+1]){
                swap(a,i,i+1);
            }
        }
        if (n-1 > 1){
            bubbleSortRec(a,n-1);
        }
    }

    static void swap(int[] a,int i ,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
/*
The worst-case time complexity of bubble sort is O(n2), where n is the size of the input.
The worst case happens when the array is reverse sorted.
The best-case time complexity of bubble sort is O(n).
The best case happens when the array is already sorted, and the algorithm is modified to stop running when the inner loop didn’t do any swap.
The optimized implementation can be seen here.
The auxiliary space used by the iterative version is O(1) and O(n) by the recursive version for the call stack.
 */