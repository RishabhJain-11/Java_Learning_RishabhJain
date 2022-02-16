package com.javacompany.leetcodeassignment;

public class MaxNiceDivisors {
    public static void main(String[] args) {

    }
    long modpow(long base , int exp , int modulus){
        long result = 1;
        for (; exp > 0; exp >>=1) {
            if ((exp & 1) == 1)
                result = result * base % modulus;
            base = base * base % modulus;
        }
        return  result;
    }

    public int maxNiceDivisors(int n ){
        int[] st = new int[]{0,1,2,3,4,6};
        int mod = 1000000007;
        return n<6 ? st[n] :(int) (modpow(3,n/3-1,mod)*st[3+n%3] %mod);
    }
}
