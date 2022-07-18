package com.dsajavarev;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/number-of-submatrices-that-sum-to-target/
public class NumberOfSubmatricesThatSumToTarget {
    public static void main(String[] args) {
        int[][] matrix = {{0,1,0},{1,1,1},{0,1,0}};
        int target = 0;
        System.out.println(numSubmatrixSumTarget(matrix,target));
    }
    public static int numSubmatrixSumTarget(int[][] A, int target) {
        int res = 0, m = A.length, n = A[0].length;

        for(int i = 0;i < m;i++)
            for(int j = 1;j < n;j++)
                A[i][j] += A[i][j-1];

        Map<Integer, Integer> counter = new HashMap<>();
        for(int i = 0;i < n;i++){
            for(int j = i;j < n;j++){
                counter.clear();
                counter.put(0, 1);
                int cur = 0;

                for (int[] ints : A) {
                    cur += ints[j] - (i > 0 ? ints[i - 1] : 0);
                    res += counter.getOrDefault(cur - target, 0);
                    counter.put(cur, counter.getOrDefault(cur, 0) + 1);
                }
            }
        }
        return res;
    }
}
