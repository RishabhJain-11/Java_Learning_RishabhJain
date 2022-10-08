package com.dsajavarev;

import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] A = {-1, 2, 1, -4};
        int B = 1;
        System.out.println(threeSumClosest(A, B));
    }
    public static int threeSumClosest(int[] A,int B){
        int minTillNow = Integer.MAX_VALUE;
        int res = -1;
        Arrays.sort(A);
        int n = A.length;
        for (int i = 0;i < n - 2;i++){
            int l = i + 1;
            int r = n - 1;
            while(l < r){
                int sum = A[i] + A[l] + A[r];
                int diff = Math.abs(sum - B);
                if(diff < minTillNow){
                    minTillNow = diff;
                    res = sum;
                }
                if(sum > B)
                    r--;
                else if(sum < B)
                    l++;
                else
                    return B;
            }
        }
        return res;
    }
}
