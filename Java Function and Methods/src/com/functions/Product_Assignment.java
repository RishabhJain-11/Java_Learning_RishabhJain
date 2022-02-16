package com.functions;

import java.util.Scanner;

public class Product_Assignment {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first num :");
        int a = in.nextInt();
        System.out.print("Enter the second num :");
        int b = in.nextInt();

        int ans = mul(a,b);
        System.out.println("The product of the given numbers is = "+ans);

    }

    static int mul (int a , int b){
        int prod = a*b;
        return prod;
    }
}
