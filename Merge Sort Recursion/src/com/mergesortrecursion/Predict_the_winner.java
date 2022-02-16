package com.mergesortrecursion;

public class Predict_the_winner {
     public static void main (String[] args) {

          int [] nums = { 1,5,233,7};
          System.out.println(PredictTheWinner(nums));
     }

     static boolean PredictTheWinner (int[]nums)
     {

          int n = nums.length;	//created a variable n which isv equal to nums.length
          int[][] dp = new int[n][n];	//created a 2d array

          for (int i = 0; i < n; i++)
          {

               dp[i][i] = nums[i];

          }

          for (int len = 1; len < n; len++)
          {

               for (int i = 0; i < n - len; i++)
               {

                    int j = i + len;


                    dp[i][j] =
                            Math.max (nums[i] - dp[i + 1][j], nums[j] - dp[i][j - 1]);

               }
          }
          return dp[0][n - 1] >= 0;

     }

}
