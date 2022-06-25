package com.dsajavarev;

public class NonDecreasingArray {
    public static void main(String[] args) {
        int[] nums = {4,2,3};
        System.out.println(checkPossibility(nums));
    }
    public static boolean checkPossibility(int[] nums) {
        int cnt = 0;//the number of changes
        for(int i = 1; i < nums.length && cnt<=1 ; i++){
            if(nums[i-1] > nums[i]){
                cnt++;
                if(i-2<0 || nums[i-2] <= nums[i])
                    nums[i-1] = nums[i];

                else
                    nums[i] = nums[i-1];
            }
        }
        return cnt <= 1;
    }
}
