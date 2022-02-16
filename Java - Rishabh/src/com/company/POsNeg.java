package com.company;

import java.util.Scanner;

public class POsNeg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num = in.nextDouble();
        if(num>0.0)
            System.out.println(num+" is positive number.");
        else
            System.out.println(num+" is a negative number.");
    }
}
