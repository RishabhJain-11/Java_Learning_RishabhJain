package com.dsajavarev;

public class EquilibriumPoint {
    public static void main(String[] args) {
        int n = 5;
        long[] A = {1,3,5,2,2};
        System.out.println(equilibriumPoint(A,n));
    }
    public static int equilibriumPoint(long[] arr, int n) {

        // Your code here
        long sum = 0;
        long leftSum = 0;

        for(int i = 0;i < n;i++)
            sum = sum + arr[i];


        for(int i = 0;i < n;i++){
            sum = sum - arr[i];

            if(leftSum == sum)
                return i + 1;
            leftSum += arr[i];
        }
        return -1;
    }
}
