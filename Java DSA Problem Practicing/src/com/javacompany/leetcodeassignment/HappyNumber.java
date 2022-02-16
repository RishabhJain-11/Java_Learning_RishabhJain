package com.javacompany.leetcodeassignment;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        int num = 9;
        System.out.println(isHappy(num));
    }

    static private int getNext(int n){
        int totalSum = 0;
        while (n>0){
            int d =n%10;
            n = n/10;
            totalSum += d*d;
        }
        return totalSum;
    }

    static boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {

            seen.add(n);
            n = getNext(n);

        }
        return n==1;
    }

}
