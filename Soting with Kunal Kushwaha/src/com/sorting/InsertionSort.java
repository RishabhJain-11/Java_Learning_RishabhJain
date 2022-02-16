package com.sorting;

import java.util.Arrays;

//insertion sort
//stable
//used for smaller value of n
// best when some part of the array is partially sorted
//thats why it is used in hybrid sorting algorithm
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,-4,6,-2,4};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr){
        for (int i = 0; i <= arr.length-2; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }


    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
