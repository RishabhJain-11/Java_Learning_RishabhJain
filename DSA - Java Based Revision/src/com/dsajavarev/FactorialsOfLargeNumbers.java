package com.dsajavarev;

import java.util.ArrayList;

public class FactorialsOfLargeNumbers {

    /*public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }
    public static int factorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }

        if(n == 2){
            return 2;
        }

        return n * factorial(n-1);
    }
     */
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }
    public static ArrayList<Integer> factorial(int n){
        java.math.BigInteger b = new java.math.BigInteger("1");
        for (int i = 1;i <= n;i++){
            b = b.multiply(java.math.BigInteger.valueOf(i));
        }
        String str = b.toString();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0;i < str.length();i++){
            ans.add(str.charAt(i) - '0');
        }
        return ans;
    }
}
