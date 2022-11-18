package com.dsajavarev;

public class UglyNumber {
    public static void main(String[] args) {

    }

    public boolean uglyNumber(int n){
        if(n <= 0){
           return false;
        }

        for(int factor : new int[]{2,3,4,5}){
            n = keepDividingWithDivisor(n, factor);
        }
        return n==1;
    }

    private int keepDividingWithDivisor(int dividend, int divisor) {
        while(dividend % divisor == 0){
            dividend /= divisor;
        }
        return dividend;
    }
}
