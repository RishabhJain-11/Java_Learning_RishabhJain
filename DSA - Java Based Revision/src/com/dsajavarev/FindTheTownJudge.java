package com.dsajavarev;

public class FindTheTownJudge {
    public static void main(String[] args) {
        int n = 2;
        int[][] trust = {{1,3}, {2, 3}};
        System.out.println(findJudge(n, trust));
    }
    public static int findJudge(int N, int[][] trust) {
        int[] count = new int[N+1];
        for (int[] t: trust) {
            count[t[0]]--;
            count[t[1]]++;
        }
        for (int i = 1; i <= N; ++i) {
            if (count[i] == N - 1) return i;
        }
        return -1;
    }
}
