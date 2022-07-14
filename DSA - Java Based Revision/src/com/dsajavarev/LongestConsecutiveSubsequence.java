package com.dsajavarev;

import java.util.Arrays;

public class LongestConsecutiveSubsequence {
    public static void main(String[] args) {
        int N = 7;
        int a[] = {2,6,1,9,4,5,3};
        System.out.println(findLongestConseqSubseq(a,N));
    }
    public static int findLongestConseqSubseq(int[] arr, int N){
        Arrays.sort(arr);
        int maxLen = 1;
        int currLen = 1;

        for(int i = 0;i < N-1;i++){
            if (arr[i+1] == arr[i] || arr[i+1] == arr[i] + 1){
                currLen++;

                if (arr[i+1] == arr[i]){
                    currLen--;
                }
                if(currLen > maxLen){
                    maxLen = currLen;
                }
            }
            else{
                currLen = 1;
            }
        }
        return maxLen;
    }
}
/*
1
2
3
4
5
6
7 -
8 -
9
longest cons seq - 1 to 6
The consecutive numbers here
are 1, 2, 3, 4, 5, 6. These 6
numbers form the longest consecutive
subsequence.

sort the array
try to find the continuous seq
if there is a gap just break
go for another seq
compare and return length of the longest cons seq
 */