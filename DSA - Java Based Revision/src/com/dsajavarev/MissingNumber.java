package com.dsajavarev;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int result = n * (n + 1)/2;
        for (int num : nums) result -= num;
        return result;
    }
    /**
     * int MissingNumber(int array[], int n) {
     *         // Your Code Here
     *         int xor = 0;
     *         for(int x : array)
     *             xor = xor ^ x;
     *         for(int i = 1;i<=n;i++)
     *             xor = xor ^ i;
     *         return xor;
     *     }
     */
}
