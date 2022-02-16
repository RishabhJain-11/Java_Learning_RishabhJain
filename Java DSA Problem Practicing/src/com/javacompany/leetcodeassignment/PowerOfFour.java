package com.javacompany.leetcodeassignment;

public class PowerOfFour {
    public static void main(String[] args) {

        int n = 256;
        System.out.println(power(n));
    }

    static boolean power(int n){
        if (n==0)
            return false;

        while (n != 1){
            int r = n % 4;
            n = n / 4;
            if(r != 0)
                return false;
//            return true;
        }
        return true;
    }

}
