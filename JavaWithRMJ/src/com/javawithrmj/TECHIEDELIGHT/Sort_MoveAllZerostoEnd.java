package com.javawithrmj.TECHIEDELIGHT;

import java.util.Arrays;

public class Sort_MoveAllZerostoEnd {
    public static void main(String[] args) {
        int[] nums = {6,0,8,2,3,0,4,0};
//        moveAllZeros(nums);

        moveAllZerosQuickSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void moveAllZeros(int [] nums){
        int k = 0;
        for (int i : nums){
            if(i != 0){
                nums[k++] = i;
            }
        }
        for (int i = k; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
    static void moveAllZerosQuickSort(int [] nums){
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                swap(nums,i,j);
                j++;
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
     }


}
