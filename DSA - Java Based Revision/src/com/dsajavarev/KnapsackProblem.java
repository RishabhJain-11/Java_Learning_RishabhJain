package com.dsajavarev;

public class KnapsackProblem {
    public static void main(String[] args) {
        int N = 3;
        int W = 4;
        int[] values = {1,2,3};
        int[] weight = {4,5,1};
        System.out.println(knapSack(W,weight,values,N));
    }
    static int knapSack(int W, int[] wt, int[] val, int n)
    {
        // your code here
        int[][] dp = new int[n+1][W+1];
        int max = 0;
        for(int i = 1;i < n+1;i++){
            for(int j = 1;j < W+1;j++){
                dp[i][j] = dp[i-1][j];

                if(j >= wt[i-1]){
                    int diff = j - wt[i - 1];
                    dp[i][j] = Math.max(dp[i][j],(dp[i-1][j-wt[i-1]] + val[i-1]));
                }
            }
        }
        return dp[n][W];
    }
}
