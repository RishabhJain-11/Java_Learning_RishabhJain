package com.dsajavarev;

import java.util.Arrays;

public class MinMovesTwo {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(minMoves2(nums));
    }
    public static int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int i = 0,j = nums.length - 1;
        int count = 0;
        while(i < j){
            count += nums[j] - nums[i];
            i++;
            j--;
        }
        return count;
    }
}
