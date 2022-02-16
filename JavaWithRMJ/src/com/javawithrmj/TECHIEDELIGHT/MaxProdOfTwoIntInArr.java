package com.javawithrmj.TECHIEDELIGHT;

import java.util.Arrays;

public class MaxProdOfTwoIntInArr {
    public static void main(String[] args) {
        int [] nums = {-10,-3,5,6,-2};
//        findmaxProdNaive(nums);
//        findmaxProdSort(nums);
        findMaximumProduct(nums);
    }



    static void findmaxProdNaive(int[] nums){
        //base case
        if(nums.length < 2){
            return ;
        }
        int max_prod = Integer.MIN_VALUE;
        int max_i = -1;int max_j = -1;

        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (max_prod < nums[i]*nums[j]){
                    max_prod = nums[i] * nums[j];
                    max_i = i;
                    max_j = j;
                }
            }
        }
        System.out.println("Pair of numbers with indexes is ( "+ max_i + " , "+max_j+" ) ");
        System.out.println("Pair of numbers with numbers is ( "+ nums[max_i] + " , "+nums[max_j]+" ) ");
    }

    static void findmaxProdSort(int[]nums){
        int n = nums.length;

        if (nums.length < 2){
            return;
        }
        Arrays.sort(nums);

        if (nums[0] * nums[1] > nums[n-1] * nums[n-2]){
            System.out.println("Pair of numbers with indexes is ( "+ nums[0] + " , "+nums[1]+" ) ");
        }
        else{
            System.out.println("Pair of numbers with indexes is ( "+ nums[n-1] + " , "+nums[n-2]+" ) ");
        }
    }


//    static

    // Function to find the maximum product of two integers in an array
    public static void findMaximumProduct(int[] A)
    {
        // to store the maximum and second maximum element in an array
        int max1 = A[0], max2 = Integer.MIN_VALUE;

        // to store the minimum and second minimum element in an array
        int min1 = A[0], min2 = Integer.MAX_VALUE;

        for (int i = 1; i < A.length; i++)
        {
            // if the current element is more than the maximum element,
            // update the maximum and second maximum element
            if (A[i] > max1)
            {
                max2 = max1;
                max1 = A[i];
            }

            // if the current element is less than the maximum but greater than the
            // second maximum element, update the second maximum element
            else if (A[i] > max2) {
                max2 = A[i];
            }

            // if the current element is less than the minimum element,
            // update the minimum and the second minimum
            if (A[i] < min1)
            {
                min2 = min1;
                min1 = A[i];
            }

            // if the current element is more than the minimum but less than the
            // second minimum element, update the second minimum element
            else if (A[i] < min2) {
                min2 = A[i];
            }

            // otherwise, ignore the element
        }

        // choose the maximum of the following:
        // 1. Product of the maximum and second maximum element or
        // 2. Product of the minimum and second minimum element
        if (max1 * max2 > min1 * min2) {
            System.out.print("Pair is (" + max1 + ", " + max2 + ")");
        }
        else {
            System.out.print("Pair is (" + min1 + ", " + min2 + ")");
        }
    }
}
