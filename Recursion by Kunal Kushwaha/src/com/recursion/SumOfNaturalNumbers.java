package com.recursion;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int n =5;
        System.out.println(recurSum(n));
    }
    static int recurSum(int n){
        if(n<=1)
            return 1;
        return n+recurSum(n-1);
    }
}
