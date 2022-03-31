package com.dsajavarev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumNoOfCoins {
    public static void main(String[] args) {
        int n = 43;
        System.out.println(minPartition(n));;
    }
    static List<Integer> minPartition(int N)
    {
        List<Integer> ans = new ArrayList<>();

        int[] money = {1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
        int n_notes = money.length;

        int[] dp = new int[N+1];
        int[] note_used = new int[N+1];

        for(int i=1; i<=N; i++)
        {
            dp[i] = Integer.MAX_VALUE;
            int note = 0;
            for(int j=0; j<n_notes; j++)
            {
                if(money[j]<=i)
                {
                    if(dp[i]>dp[i-money[j]]+1)
                    {
                        dp[i] = dp[i-money[j]] + 1;
                        note = j;
                    }
                }
                else
                {
                    break;
                }
            }
            note_used[i] = money[note];

        }

        int i = N;
        while(i>0)
        {
            ans.add(note_used[i]);
            i = i - note_used[i];
        }

        Collections.reverse(ans);

        return ans;
    }
}
