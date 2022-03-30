package com.dsajavarev;

import java.util.HashMap;

public class CountTheNoOfStairs {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(countWays(n));
    }


    //Function to count number of ways to reach the nth stair.
    static int countWays(int n)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        // your code here
        if(n == 0 || n==1){
            return 1;
        }
        map.put(n,(countWays(n-1) + countWays(n-2) % 1000000007));

        return map.get(n) % 1000000007;
    }
}
