package com.javacompany.leetcodeassignment;

import java.util.Scanner;

public class DivideTwoIntegers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the dividend = ");
        int divid = in.nextInt();
        System.out.print("Enter the divisor = ");
        int divis = in.nextInt();
        System.out.print("The Quotient is = ");
        System.out.println(divide(divid,divis));
    }
    static int divide(int dividend, int divisor) {

        if(dividend == 1<<31 && divisor == -1) return Integer.MAX_VALUE;
        boolean sign = (dividend>=0) ==(divisor >= 0) ? true : false;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        int result = 0;
        while (dividend - divisor >= 0){
            int count = 0;
            while(dividend - (divisor<< 1<<count) >= 0){
                count++;
            }
            result += 1<<count;
            dividend-=divisor<<count;
        }
        return sign? result : -result;
    }
}
/*
dividend = 10
div = 3

dividend = quotient * divisor + remainder
10 = 3 *3 +1
[10 | 7 | 4 | 3]
[3 | 3 | 3 | 3]
 */
