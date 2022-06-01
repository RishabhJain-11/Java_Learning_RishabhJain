package com.dsajavarev;

import java.util.Arrays;

public class RunningTheSumOfOneDArray {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
    public static int[] runningSum(int[] nums) {
        int i = 1;
        while(i < nums.length){
            nums[i] += nums[i-1];
            i++;
        }
        return nums;
    }
}
