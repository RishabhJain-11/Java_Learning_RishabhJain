package com.dsajavarev;

public class NumberOfOnesBits {
    public static void main(String[] args) {
        int n = 23;
        System.out.println(hammingWeight(n));
    }
    public static int hammingWeight(int n) {
        int ones = 0;
        while(n!=0){
            ones = ones + (n&1);
            n = n >>> 1;
        }
        return ones;
    }
}
