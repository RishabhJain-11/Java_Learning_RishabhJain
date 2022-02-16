package com.javacompany.leetcodeassignment;

import java.util.Arrays;

public class SortArrayofTwoSwappedElements {
    public static void main(String[] args) {

        int[] nums = {3,8,6,7,5,9};
        sorttwoSwapelemnets(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void sorttwoSwapelemnets(int[]nums){
        if(nums.length <= 1){
            return;
        }
        int x = -1;
        int y = -1;

        int prev = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (prev > nums[i]){
                if (x == -1){
                    x = i - 1;
                    y = i;
                }else {
                    y = i;
                }
            }
            prev = nums[i];
        }
        swap(nums,x,y);
    }


    static void swap(int[] nums,int i ,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
