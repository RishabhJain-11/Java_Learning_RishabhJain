package com.sorting;

import java.util.Scanner;

//import static com.sorting.NumberOfWaysToSplitAString.Solution.numWays;

public class NumberOfWaysToSplitAString {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

//        System.out.println(numWays(s));
    }


    static class Solution {
        private static final int m = 1_000_000_007;
        static int numWays(String s) {
            int ones = 0, n = s.length();
            for (int i = 0; i < n; ++i) {
                ones += s.charAt(i) - '0';
            }
            if (ones == 0) {
                return (int)((n - 2L) * (n - 1L) / 2 % m);
            }
            if (ones % 3 != 0) {
                return 0;
            }
            int onesInEachSplitedBlock = ones / 3;
            long waysOfFirstCut = 0, waysOfSecondCut = 0;
            for (int i = 0, count = 0; i < n; ++i) {
                count += s.charAt(i) - '0';
                if (count == onesInEachSplitedBlock) {
                    ++waysOfFirstCut;
                }else if (count == 2 * onesInEachSplitedBlock) {
                    ++waysOfSecondCut;
                }
            }
            return (int)(waysOfFirstCut * waysOfSecondCut % m);
        }
    }
}
