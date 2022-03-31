package com.dsajavarev;

public class EditDistance {
    public static void main(String[] args) {
        String s = "geek";
        String t = "gesek";
        System.out.println(editDistance(s,t));
    }
    public static int editDistance(String s, String t) {
        // Code here
        int[][] dp = new int[s.length()+1][t.length()+1];
        for(int i=0;i<s.length()+1;i++)
        {
            for(int j=0;j<t.length()+1;j++)
            {
                if(i==0) dp[i][j] = j;
                if(j==0) dp[i][j] = i;
            }
        }
        for(int i=1;i<dp.length;i++)
        {
            for(int j=1;j<dp[0].length;j++)
            {
                //if the character are already equal then it will check for its i-1 and j-1
                //characters as for ith character no extra moves will be required
                if(s.charAt(i-1)==t.charAt(j-1))
                {
                    dp[i][j] = dp[i-1][j-1];
                }
                //from all three states i.e. dp[i-1][j-1],dp[i-1][j],dp[i][j-1] its possible
                // to reach dp[i][j] by performing the three operations hence we will take the
                //smallest among the three and add 1 to it for the current operation
                //as the two chracters arent equal
                else
                {
                    dp[i][j] = 1 + Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
