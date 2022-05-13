package com.dsajavarev;

public class LuckyNumber {
    public static void main(String[] args) {
        int n = 19;
        System.out.println(isLucky(n));
    }
    public static boolean isLucky(int n)
    {
        // Your code here
        for(int i = 2;i <= n;i++){
            if(n % i == 0) return false;
            n = n - n/i;
        }
        return true;
    }
}
