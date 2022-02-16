package com.practice;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        float dollar ;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your value in Rupees : Rs ");
        float rupees = in.nextFloat();

        dollar = rupees/70;

        System.out.println("Your Converted value in dollars is :"+dollar + "$");

    }
}
