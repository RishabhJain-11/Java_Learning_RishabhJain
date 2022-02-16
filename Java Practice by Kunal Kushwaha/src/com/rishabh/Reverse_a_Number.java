package com.rishabh;

public class Reverse_a_Number {
    public static void main(String[] args) {


        int n = 34532;

        int ans = 0;
        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            ans = ans * 10 + rem;
        }
        System.out.println(ans);
    }
}