package com.javacompany.leetcodeassignment;

public class EqualSubStrings {
    public static void main(String[] args) {
        // s = "abcd", t = "bcdf", maxCost = 3
        String s = "abcd";
        String t = "bcdf";
        int mxc = 3;
        System.out.println(equalSubstrings(s,t,mxc));
    }
    static int equalSubstrings(String s,String t,int k){
        int n = s.length(),i=0,j;
        for (j = 0; j < n; j++) {
            k -= Math.abs(s.charAt(j) - t.charAt(j));

            if (k < 0){
                k += Math.abs(s.charAt(i) - t.charAt(i));
                ++i;
            }
        }
        return j - i;
    }
}
/*
Explanation:

The idea is that you want to convert one character to another in that same position i.e. s[i] to t[i] such that you form the longest contiguous converted String.

There is just one key realization that you must make to solve this problem:

You need to realize that this problem can be reduced to finding the longest subarray such that the sum of the elements in that subarray is less than maxCost.

This is because you can generate an array diff such that diff[i] = Math.abs(s[i] - t[i]) which is the cost of converting one character to another. You also want to find the maximum length substring that can be converted given the maxCost so this is equivalent to finding the longest subarray in diff which has sum of elements less than cost.

For this we can use a sliding window. We slide the end of the window to the right with each step. If the total sum exceeds the maxCost, we slide the start of the window to the right until the total sum inside the window is less than maxCosts. With each eligible window, we take the length and keep track of the maximum length.

For more info on sliding window: Explanation

Code:


class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        // Convert the problem into a min subarray problem
        int[] diff = new int[s.length()];
        for(int i = 0; i < s.length(); ++i) {
            int asciiS = s.charAt(i);
            int asciiT = t.charAt(i);
            diff[i] = Math.abs(asciiS - asciiT);
        }

        // Now find the longest subarray <= maxCost
        // all diff[i] >= 0 (non-negative)

        // Use sliding window?
        int maxLen = 0;
        int curCost = 0;
        int start = 0;

        for(int end = 0; end < diff.length; ++end) {
            curCost += diff[end];
            while(curCost > maxCost) {
                curCost -= diff[start];
                ++start;
            }
            maxLen = Math.max(maxLen, end - start + 1);
        }

        return maxLen;
    }
}
Time Complexity: O(N) where N is the length of strings s, t
Space Complexity: O(N) for diff
Note: O(1) space can be achieved if we don't create the diff array - we can just get the values on the fly.
 */