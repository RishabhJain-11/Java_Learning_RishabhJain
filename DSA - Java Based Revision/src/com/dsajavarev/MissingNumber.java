package com.dsajavarev;

public class MissingNumber {
    public static void main(String[] args) {
        int nums[] = {3,0,1};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int result = n * (n + 1)/2;
        for(int i=0;i<nums.length;i++)
            result -= nums[i];
        return result;
    }
}
