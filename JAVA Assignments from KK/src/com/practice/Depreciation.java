package com.practice;

import java.util.Scanner;

public class Depreciation {
    static double depriciation (float v ,float r,float t){
        float D = (float)(v*Math.pow((1 - r /100),t));
        return  D;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the initial value : ");
        float a = in.nextFloat();

        System.out.println("Enter the rate : ");
        float b = in.nextFloat();

        System.out.println("Enter the time");
        float c = in.nextFloat();

        System.out.println("The Depriciation ="+depriciation(a,b,c));

    }
}
