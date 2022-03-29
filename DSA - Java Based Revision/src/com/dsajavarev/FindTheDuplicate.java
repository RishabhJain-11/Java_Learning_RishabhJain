package com.dsajavarev;

public class FindTheDuplicate {
    public static void main(String[] args) {
        int[] nums = {3,1,3,4,2};
        System.out.println(findDuplicate(nums));
    }
    public static int findDuplicate(int[] nums) {
        boolean[] b = new boolean[nums.length];


        for (int num : nums) {
            if (b[num]) {
                return num;
            }
            b[num] = true;
        }
        return -1;
    }
}
