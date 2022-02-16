package com.recursion1;

public class ProductOfdigits {
    public static void main(String[] args) {
        int ans = Dig(56);
        System.out.println(ans);
    }
    static int Dig(int n ){
        if(n%10==n) {
            return n;
        }

        return (n%10) * Dig(n/10);
    }
}
