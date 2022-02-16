package com.recursion1;

public class SumUsingRecursion {
    public static void main(String[] args) {
        int ans = sum(10);//w - c
        System.out.println(ans);//w
    }
    static int sum(int n){//c
        if(n<=1){//w
            return 1;//c
        }

        return n + sum(n-1);//c

    }
}
