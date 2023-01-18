package com.dsajavarev;

public class MaximumSumCircularSubarray {
    public static void main(String[] args) {
        int[] nums = {1, -2, 3, -2};
        System.out.println(maxSubarraySumCircular(nums));
    }
    public static int normalMax(int[] arr){
        int maxi = arr[0], res= arr[0];
        for(int i = 1;i < arr.length;i++){
            maxi = Math.max(maxi + arr[i], arr[i]);
            res  = Math.max(res, maxi);
        }
        return res;
    }

    public static int maxSubarraySumCircular(int[] arr){
        int normal_max = normalMax(arr);
        if(normal_max < 0){
            return normal_max;
        }
        int arrSum = 0;
        for (int i = 0;i < arr.length;i++){
            arrSum += arr[i];
            arr[i] *= -1;
        }
        int circular_max = arrSum + normalMax(arr);
        return Math.max(normal_max, circular_max);
    }
}
