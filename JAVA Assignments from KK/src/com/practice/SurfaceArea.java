package com.practice;

import java.util.Scanner;

public class SurfaceArea {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);


//        int r = in.nextInt();
//
//        int h = in.nextInt();
//
//        int sa_cylinder= (int) (2*3.14*r*h);
//        System.out.println("Surface area of cylinder :"+sa_cylinder);


        System.out.println("Enter the side :");
        int a = in.nextInt();


        int tsa_cube= (int) (6*a*a);
        System.out.println("Total Surface area of cube :"+tsa_cube);
    }
}
