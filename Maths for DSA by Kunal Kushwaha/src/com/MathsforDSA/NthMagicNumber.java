package com.MathsforDSA;

public class NthMagicNumber {
    public static void main(String[] args) {
        int n =6;
        int ans = 0;
        int base = 2;//this I dont know what to do so lets see this in sometime
        while(n>0){
            int last = n&1;
            n = n>>1;

            ans += last * base;

            base = base * 5;
        }
        System.out.println(ans);
    }
}
