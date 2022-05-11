package com.dsajavarev;

import java.util.Arrays;

public class MaxSumOfTwoElementsNearToZero {
    public static void main(String[] args) {
        int[] arr = {-8 ,-66 ,-60};
        int n = 3;
        System.out.println(closestToZero(arr,n));
    }
    public static int closestToZero (int[] arr, int n)
    {
        // your code here
        Arrays.sort(arr);
        int i = 0;
        int j = n-1;
        int maxSum = arr[0] + arr[n-1];
        while(i < j){
            int currSum = arr[i] + arr[j];
            if(currSum == 0)
                return 0;
            if(currSum < 0){
                i++;
            }else{
                j--;
            }
            if(Math.abs(currSum) < Math.abs(maxSum)){
                maxSum = currSum;
            }
            if(Math.abs(currSum) == Math.abs(maxSum)){
                maxSum = Math.max(currSum,maxSum);
            }
        }
        return maxSum;
    }
}
