package com.dsajavarev;

public class PowerOfNumbers {
    public static void main(String[] args) {
        int N = 2;
        int R = 2;
        System.out.println(power(N,R));
    }
    public static long power(int N,int R)
    {
        //Your code here
        int m = 1000000007;

        if(N == 1 || R <= 1)
            return N;

        long temp = power(N,R/2);

        if(R % 2 == 0)
            return temp % m * temp % m;

        else
            return N * temp % m * temp % m;
    }
}
