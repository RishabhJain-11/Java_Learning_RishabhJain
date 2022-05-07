package com.dsajavarev;

public class OneThreeTwoNumber {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(find132pattern(nums));
    }
    public static boolean find132pattern(int[] nums) {
        int n = nums.length, top = n, third = Integer.MIN_VALUE;

        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] < third) return true;
            while (top < n && nums[i] > nums[top]) third = nums[top++];
            nums[--top] = nums[i];
        }

        return false;
    }
}
