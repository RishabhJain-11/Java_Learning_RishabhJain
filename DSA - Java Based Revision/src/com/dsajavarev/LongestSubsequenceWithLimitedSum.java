package com.dsajavarev;

import java.util.Arrays;

public class LongestSubsequenceWithLimitedSum {
    public static void main(String[] args) {
        int[] nums = {4,5,2,1}, queries = {3,10,21};
        System.out.println(Arrays.toString(answerQueries(nums, queries)));
    }
    public static int[] answerQueries(int[] A, int[] queries) {
        Arrays.sort(A);
        int preSum = A[0];

        for(int i = 1;i < A.length;i++){
            preSum = preSum + A[i];
            A[i] = preSum;
        }

        int[] ans = new int[queries.length];
        for(int i = 0;i < queries.length;i++){
            ans[i] = binarySearch(A, queries[i], 0, A.length - 1);
        }
        return ans;
    }

    public static int binarySearch(int[] A, int query, int left, int right){
        while(left < right){
            int mid = left + (right - left)/2;
            if(A[mid] == query)
                return mid+1;

            if(A[mid] < query)
                left = mid + 1;
            else
                right = mid-1;
        }
        return A[left] > query ? left : left + 1;
    }
}
