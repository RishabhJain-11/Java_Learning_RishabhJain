package com.recursion1;

public class SumOfDigits {
    public static void main(String[] args) {
        int ans = Dig(1342);
        System.out.println(ans);
    }

    static int Dig(int n ){
        if(n==0) {
            return 0;
        }

        return (n%10)+Dig(n/10);
    }
}
