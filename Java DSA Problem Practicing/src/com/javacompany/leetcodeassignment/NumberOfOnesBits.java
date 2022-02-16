package com.javacompany.leetcodeassignment;

public class NumberOfOnesBits {
    public static void main(String[] args) {

        int n = 00000000000000000000000000001011;
        System.out.println(hammingWeight(n));
    }
    static int hammingWeight(int n) {
        int ones = 0;
        while(n!=0){
            ones = ones + (n&1);
            n = n >>> 1;
        }
        return ones;
    }
}
