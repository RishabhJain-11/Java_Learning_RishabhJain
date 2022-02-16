package com.company;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int n = in.nextInt();
        if(n%2 == 0)
            System.out.println("it is an even number ");
        else
            System.out.println("it is an odd number");
    }
}
