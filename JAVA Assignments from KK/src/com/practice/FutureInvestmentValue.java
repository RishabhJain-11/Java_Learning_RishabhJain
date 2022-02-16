package com.practice;

import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the present value = ");
        double p = in.nextDouble();

        System.out.println("Enter the interest rate = ");
        double i = in.nextDouble();

        System.out.println("Enter the time period = ");
        double t = in.nextDouble();

        double f = p*Math.pow((1+i/100),t);
        System.out.println("The value is = "+f);


    }
}
