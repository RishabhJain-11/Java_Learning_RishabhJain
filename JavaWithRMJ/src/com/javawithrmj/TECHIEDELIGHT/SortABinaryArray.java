package com.javawithrmj.TECHIEDELIGHT;

import java.util.Arrays;

public class SortABinaryArray {
    public static void main(String[] args) {
        int[] nums = {1,0,1,1,0,0,0,1,0};
        sortBinaryArr(nums);
        System.out.println(Arrays.toString(nums));
//        System.out.println(Arrays.toString(sortBinaryArr(nums)));
    }
    static void sortBinaryArr(int [] nums){
/*
        Arrays.sort(nums);
        return nums;
        int zeros = 0;
        for (int val : nums){
            if(val == 0){
                zeros++;
            }
        }
        int k = 0;
        while (zeros-- != 0){
            nums[k++] = 0;
        }

        while (k < nums.length){
            nums[k++] = 1;
        }
*/
/*

        int k = 0;
        for (int i : nums){
            if (i == 0){
                nums[k++] = 0;
            }
        }

        for (int i = k; i < nums.length; i++) {
            nums[k++] = 1;
        }
*/
        //Using Quick Sprt
        int pivot = 1;
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot){
                swap(nums,i,j);
                j++;
            }
        }

    }


    public static void swap(int[] nums,int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
/*
1 Count the number of zeros after initializing it to zero
2 Put the number of zeros first and then the number of ones in the array
3 putting both the values with the help of a while loop
4
 */




