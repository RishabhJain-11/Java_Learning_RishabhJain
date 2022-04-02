package com.dsajavarev;

public class Maximum_sum_of_subarray_less_than_or_equal_to_x {
    public static void main(String[] args) {
        long[] arr = {1, 2, 3, 4, 5};
        int n = 5;
        int k = 11;
        System.out.println(findMaxSubarraySum(arr,n,k));
    }
    static long findMaxSubarraySum(long[] arr, int n, int k)
    {
        // Your code goes here
        int i = 0 , j = 0 , maxSum = 0 , sum = 0 ;
        while(j < n){
            sum +=arr[j];
            if(sum <= k)
                maxSum = Math.max(maxSum , sum);
            else {
                while(sum > k)
                {
                    sum -=arr[i];
                    i++;
                }
                maxSum = Math.max(maxSum , sum);
            }
            j++;
        }
        return maxSum;
    }
}
