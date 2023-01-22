package com.dsajavarev;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    public static int[] twoSum(int[] nums, int target){
        if(nums.length == 1 && nums[0] == target){
            return new int[]{nums[0]};
        }
        for(int i = 0;i < nums.length - 1;++i){
            for(int j = i + 1;j < nums.length;++j){
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
                if((nums[nums.length - i - 1] + nums[nums.length - j - 1]) == target){
                    return new int[]{nums.length - j - 1, nums.length - i - 1};
                }
            }
        }
        return new int[]{};
    }
}
