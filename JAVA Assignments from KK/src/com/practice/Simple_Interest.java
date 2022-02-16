package com.practice;

import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
//        float principle,rate,time;
        float si;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the principle balance :");
        float principle = in.nextFloat();


        System.out.print("Enter the annual interest rate  :");
        float rate = in.nextFloat();

        System.out.print("Enter the Time in  years :");
        float time = in.nextFloat();

        si=principle*rate*time/100;

        System.out.println("The simple interest is :"+si);
    }


}
