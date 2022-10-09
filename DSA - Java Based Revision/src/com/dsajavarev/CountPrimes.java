package com.dsajavarev;

public class CountPrimes {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(countPrimes(n));
    }
    public static int countPrimes(int n){
        int count = 0;
        boolean[] notPrime = new boolean[n];
        for (int i = 0; i < n; i++){
            if(!notPrime[i]){
                count++;
                for (int j = 0; i*j < n; j++) {
                    notPrime[i*j] = true;
                }
            }
        }
        return count;
    }
}
