package com.practice;

import java.util.Scanner;

public class Area_of_Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("Enter the radius : ");
        float radius = in.nextFloat();

        float area_of_circle ;

        area_of_circle = (float) (radius*3.14);

        System.out.println("The area of the Circle : "+area_of_circle);

    }
}
