package com.practice;

import java.util.Scanner;

public class LCM {
    static int gcd(int a , int b){
        if(a==0)
            return b;
        return gcd(b%a,a);
    }

    static  int lcm(int a , int b){
        return a / gcd(a,b)*b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("a = ");
        int a = in.nextInt();


        System.out.print("b = ");
        int b = in.nextInt();

        System.out.println("The LCM of "+a+" and "+b+" is = "+lcm(a,b));
    }
}
