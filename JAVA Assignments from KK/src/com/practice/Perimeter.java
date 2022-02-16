package com.practice;

import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        System.out.print("Enter the Radius :");
//        int radius = in.nextInt();
//
//        int p_circle= (int) (2*3.14*radius);
//
//        System.out.println("The perimeter of the Circle :"+p_circle);

//
//        System.out.print("Enter the length of side  :");
//        int side = in.nextInt();
//
//        int p_eqtriangle= (int) (3*side);
//
//        System.out.println("The perimeter of the Equilateral Triangle :"+p_eqtriangle);



        // same applies for rectangle
//        System.out.print("Enter the length of side 1  :");
//        int side1 = in.nextInt();
//
//        System.out.print("Enter the length of side 2  :");
//        int side2 = in.nextInt();
//
//        int p_parall= (int) (2*(side1+side2));
//
//        System.out.println("The perimeter of the Parallelogram :"+p_parall);



        // same applies for rhombus also
        System.out.print("Enter the length of side  :");
        int side = in.nextInt();


        int p_square= (int) (4*side);

        System.out.println("The perimeter of the square :"+p_square);

    }
}
