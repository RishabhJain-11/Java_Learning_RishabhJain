package com.javacompany.leetcodeassignment;

import java.util.Arrays;

public class ArrayPairSum {
    public static void main(String[] args) {
        int [] nums = {1,4,3,2};
        System.out.println(arraySum(nums));
    }
    static int arraySum(int[] nums){
        Arrays.sort(nums);
        int result = 0;
        for (int i= 0;i< nums.length;i+=2) {
            result += nums[i];
        }
        return result;
    }
}
