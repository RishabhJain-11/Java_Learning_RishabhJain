package com.MathsforDSA;
//Part 1
//Bit Manupulation
public class Main {

    public static void main(String[] args) {
	// write your code here
        int n = 67;
        System.out.println(isOdd(n));
    }

    static boolean isOdd(int n){
        return (n&1)==1;
    }
}
//1hr every day of lectures
//5 compulsory Q of the leetcode
//and if possible some extra topics of dsa
