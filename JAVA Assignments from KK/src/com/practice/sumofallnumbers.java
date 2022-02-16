package com.practice;

import java.util.Scanner;

class sumofallnumbers
{
    static int getSum (int n)
    {
       int sum = 0;
       while(n!=0)
       {
           sum = sum + n%10;
           n = n/10;
       }
return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Integers :");
        int n = in.nextInt();
        System.out.println(getSum(n));

    }

}











//import java.io.*;

//class GFG {
//
//    /* Function to get sum of digits */
//    static int getSum(int n) {
//        int sum = 0;
//
//        while (n != 0) {
//            sum = sum + n % 10;
//            n = n / 10;
//        }
//
//        return sum;
//    }
//
//    // Driver code
//    public static void main(String[] args) {
//        int n = 687;
//
//        System.out.println(getSum(n));
//    }
//}