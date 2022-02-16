package com.functions;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Q: Take inout of two numbers and print the sum
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the firdt no :");
        int num1 = in.nextInt();
        System.out.println("Enter the secind number :");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        System.out.println("sum = "+sum);
    }
}
