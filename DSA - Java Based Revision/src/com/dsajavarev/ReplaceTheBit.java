package com.dsajavarev;

public class ReplaceTheBit {
    public static void main(String[] args) {
        int N = 13, K = 2;
        System.out.println(replaceBit(N,K));
    }
    static int replaceBit(int n, int k){
        int temp = n;
        int c = 0;
        while(temp != 0){
            temp = temp >> 1;
            c++;
        }
        int shift = c - k;
        if(shift < 0)
            return n;
        int mask = ~(1 << shift);
        return n & mask;
    }
}
