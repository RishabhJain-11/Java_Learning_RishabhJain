package com.dsajavarev;

public class MaximumProductSubArrayGFG {
    public static void main(String[] args) {
        int N = 5;
        int Arr[] = {6, -3, -10, 0, 2};
        System.out.println(maxProduct(Arr,N));
    }
    public static long maxProduct(int[] arr,int n){
        long currmax = 1;
        long msf = Integer.MIN_VALUE;
        for (int i = 0;i < n;i++){
            currmax *= arr[i];
            msf = Math.max(msf,currmax);
            if (currmax == 0){
                currmax = 1;
            }
        }
        currmax = 1;
        for (int i = n-1;i >= 0;i--){
            currmax *= arr[i];
            msf = Math.max(msf,currmax);
            if (currmax == 0){
                currmax = 1;
            }
        }
        return msf;
    }
}
