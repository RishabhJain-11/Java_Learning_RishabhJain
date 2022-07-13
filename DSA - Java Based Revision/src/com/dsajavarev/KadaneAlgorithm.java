package com.dsajavarev;

public class KadaneAlgorithm {
    public static void main(String[] args) {
        int N = 4;
        int[] Arr = {-1,-2,-3,-4};
        System.out.println(maxSubarraySum(Arr,N));
    }
    public static long maxSubarraySum(int[] nums,int n){
        // Solution 2;
        long largestSum = nums[0];
        long currentMax = nums[0];

        for(int i = 1;i < nums.length;i++){
            currentMax += nums[i];

            if(currentMax < nums[i]){
                currentMax = nums[i];
            }

            if(largestSum < currentMax){
                largestSum = currentMax;
            }
        }
        return largestSum;
    }
}
