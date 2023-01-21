package com.dsajavarev;

public class FindPivotIndex {
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
    }
    public static int pivotIndex(int[] nums){
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int leftSum = 0;
        for(int j = 0;j < nums.length;j++){
            if(sum - leftSum - nums[j] == leftSum){
                return j;
            }
            leftSum += nums[j];
        }
        return -1;
    }
}
