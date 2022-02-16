package com.functions;

import java.util.Scanner;

public class Sum_Assignment_methods {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number :");
        int a = in.nextInt();

        System.out.print("Enter the second number :");
        int b = in.nextInt();

        int total = sum(a,b);
        System.out.print("The sum for the numbers "+a+" and "+b+" is = "+total);
    }

    static int sum(int x , int y){
        int result = x+y;

        return result;

    }
}
