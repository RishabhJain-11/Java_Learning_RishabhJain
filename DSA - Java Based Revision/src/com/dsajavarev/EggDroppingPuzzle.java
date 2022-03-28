package com.dsajavarev;

public class EggDroppingPuzzle {
    public static void main(String[] args) {
        int n = 1;
        int k = 2;
        System.out.println(eggDrop(n,k));
    }
    static int eggDrop(int n, int k)
    {
        // Your code here
        int dp[][]=new int[k+1][n+1];
        for (int i=1;i<=n;i++){
            dp[1][i]=1;
            dp[0][i]=0;
        }
        for (int j=1;j<=k;j++){
            dp[j][1]=j;
        }
        for (int i=2;i<=k;i++){
            for (int j=2;j<=n;j++){
                dp[i][j]=Integer.MAX_VALUE;
                for (int x=1;x<=i;x++){
                    dp[i][j]=Math.min(dp[i][j],1+Math.max(dp[x-1][j-1],dp[i-x][j]));
                }
            }
        }
        return dp[k][n];
    }
}
