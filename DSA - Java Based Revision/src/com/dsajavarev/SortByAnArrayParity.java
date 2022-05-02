package com.dsajavarev;

import java.util.Arrays;

public class SortByAnArrayParity {
    public static void main(String[] args) {
        int[] A = {3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(A)));
    }
    public static int[] sortArrayByParity(int[] A) {
        /*Integer[] B = new Integer[A.length];
        for(int t=0;t<A.length;t++)
            B[t] = A[t];

        Arrays.sort(B,(a,b) -> Integer.compare(a%2,b%2));

        for(int t=0;t<A.length;t++)
            A[t] = B[t];

        return A;*/

        int [] ans = new int[A.length];
        int t=0;
        for (int j : A) {
            if (j % 2 == 0) {
                ans[t++] = j;
            }
        }
        for (int j : A) {
            if (j % 2 == 1) {
                ans[t++] = j;
            }
        }
        return ans;
    }
}
