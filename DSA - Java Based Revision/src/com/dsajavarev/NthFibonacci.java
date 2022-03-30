package com.dsajavarev;

public class NthFibonacci {
    public static void main(String[] args) {
        long n = 2;
        System.out.println(nthFibonacci(n));
    }
    static long nthFibonacci(long n){
        // code here
        int N = (int)n;
        long[] dp = new long[N+1];
        dp[1] = 1;
        for(int i = 2;i <= N;i++){
            dp[i] = (dp[i-1] + dp[i-2]) % 1000000007;
        }
        return dp[N];
    }
}
