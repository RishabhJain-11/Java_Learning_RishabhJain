package com.dsajavarev;

import java.util.HashMap;

public class GetMinimumSquares {
    public static void main(String[] args) {
        int n = 100;
        System.out.println(MinSquares(n));
    }

    public static int MinSquares(int n)
    {
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        if (m.get(n) !=null)
            return m.get(n);

        // Code here
        if (n==1) {
            m.put(1,1);
            return 1;
        }
        int sq= (int) Math.sqrt(n);
        if (sq*sq ==n ) {
            m.put(n,1);
            return 1;
        }
        int min=Integer.MAX_VALUE;

        for (int i=sq; i>=1; i--) {
            int v= 1+ MinSquares(n-i*i);
            if (v < min)
                min=v;
            if (min==1)
                break;
        }

        m.put(n,min);
        return min;

    }
}
