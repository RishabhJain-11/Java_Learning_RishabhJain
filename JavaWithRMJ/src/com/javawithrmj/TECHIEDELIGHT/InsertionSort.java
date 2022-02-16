package com.javawithrmj.TECHIEDELIGHT;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {3, 8, 5, 4, 1, 9, -2};
//        sort(nums);
        sortRucursive(nums,1, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    /*
    How Insertion Sort works?
The idea is to divide the array into two subsets – sorted subset and unsorted subset.
 Initially, a sorted subset consists of only one first element at index 0.
 Then for each iteration, insertion sort removes the next element from the unsorted subset, finds the location it belongs within the sorted subset and inserts it there.
 It repeats until no input elements remain. The following example explains it all:

i = 1    [ 3  8  5  4  1  9  -2 ]
i = 2    [ 3  8  5  4  1  9  -2 ]
i = 3    [ 3  5  8  4  1  9  -2 ]
i = 4    [ 3  4  5  8  1  9  -2 ]
i = 5    [ 1  3  4  5  8  9  -2 ]
i = 6    [ 1  3  4  5  8  9  -2 ]
         [ -2  1  3  4  5  8  9 ]
     */

//    Following is an iterative implementation of the insertion sort algorithm:
    static void sort(int[] nums){
        for (int i = 1; i < nums.length; i++) {
            int val = nums[i];
            int j = i;

            while (j > 0 && nums[j - 1] > val){
                nums[j] = nums[j-1];
                j--;
            }

            nums[j] = val;
        }
    }


    static void sortRucursive(int [] nums,int i , int n){
        int val = nums[i];
        int j = i;

        while (j>0 && nums[j-1]>val){
            nums[j] = nums[j-1];
            j--;
        }
        nums[j] = val;

        if (i+1 <= n){
            sortRucursive(nums,i+1,n);
        }
    }
}
/*
Insertion Sort Performance
The worst-case time complexity of insertion sort is O(n2), where n is the size of the input.
The worst case happens when the array is reverse sorted.
The best-case time complexity of insertion sort is O(n).
The best case happens when the array is already sorted.
The auxiliary space used by the iterative version is O(1) and O(n) by the recursive version for the call stack.
 */