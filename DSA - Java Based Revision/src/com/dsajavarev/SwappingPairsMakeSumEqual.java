package com.dsajavarev;

import java.util.HashSet;
import java.util.Set;

public class SwappingPairsMakeSumEqual {
    public static void main(String[] args) {
        int N = 6, M = 4;
        long[] A = {4, 1, 2, 1, 1, 2};
        long[] B = {3, 6, 3, 3};
        System.out.println(findSwapValues(A,N,B,M));
    }
    public static long findSwapValues(long[] A, int n, long[] B, int m)
    {
        // Your code goes here
        long sumA = 0;
        long sumB = 0;
        Set<Long> hashSet = new HashSet<>();
        for(int i =0;i < n;i++){
            sumA += A[i];
        }
        for(int i = 0;i < m;i++){
            sumB += B[i];
            hashSet.add(2 * B[i]);
        }

        for(int i = 0;i < n;i++){
            if(hashSet.contains(sumB - sumA + 2 * A[i])){
                return 1;
            }
        }
        return -1;
    }
}
