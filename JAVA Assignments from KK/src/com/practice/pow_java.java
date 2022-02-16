package com.practice;
import java.lang.Math;
import java.util.Scanner;

public class pow_java {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Base :");
        double a = in.nextDouble();
        System.out.println("Exponent");
        double b = in.nextDouble();

        System.out.println("Power : "+Math.pow(a,b));


    }
}
