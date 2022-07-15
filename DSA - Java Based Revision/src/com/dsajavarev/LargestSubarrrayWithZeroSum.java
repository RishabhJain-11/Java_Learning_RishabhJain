package com.dsajavarev;

import java.util.HashMap;

public class LargestSubarrrayWithZeroSum {
    public static void main(String[] args) {
        int N = 8;
        int[] A = {15,-2,2,-8,1,7,10,23};
        System.out.println(maxLen(A,N));
    }
    public static int maxLen(int[] arr, int n)
    {
        HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();

        int sum = 0; // Initialize sum of elements
        int max_len = 0; // Initialize result

        // Traverse through the given array
        for (int i = 0; i < arr.length; i++) {
            // Add current element to sum
            sum += arr[i];

            if (arr[i] == 0 && max_len == 0)
                max_len = 1;

            if (sum == 0)
                max_len = i + 1;

            // Look this sum in hash table
            Integer prev_i = hM.get(sum);

            // If this sum is seen before, then update max_len
            // if required
            if (prev_i != null)
                max_len = Math.max(max_len, i - prev_i);
            else // Else put this sum in hash table
                hM.put(sum, i);
        }

        return max_len;
    }
}
