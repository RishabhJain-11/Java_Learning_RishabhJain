package com.pattern;

import java.util.Scanner;

public class halfpyramid {
    public static void main(String[] args) {

//        int temp = 0 ;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows for half pyramid = ");
        int n = in.nextInt();
        /*
        Half Pyramid
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
         */

        /*
        Inverted Half Pyramid
        for (int row = n; row >= 1 ; row--) {
            for (int col = row; col >= 1; col--) {
                System.out.print("* ");
            }
            System.out.println("");
        }*/

        /*
        //3). Program to print right half pyramid pattern using star(*) in Java
        for (int row = n; row >=1 ; row--) {
            for (int spaces = row; spaces >= 2 ; spaces--) {
                System.out.print(" ");
            }
            for (int col = 1; col <= n - row + 1 ; col++) {
                System.out.print("*");//dont include space after * otherwise it will print a pyramid
            }
            System.out.println("");
        }*/
/*
        4). Program to print inverted right half pyramid pattern using star(*) in Java
        for (int row = n; row>= 1; row--) {
            for (int spaces = 1; spaces <= n-row ; spaces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row ; col++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        */
        /*
        //5). Program to print full pyramid pattern using star(*) in Java
        for (int i = n; i >= 1 ; i--) {
            for (int j = i; j >= 2 ; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <=2*(n-i+1)-1 ; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        ------------------------------------------------------------------------------------------------------
        for (int row = n; row >=1 ; row--) {
            for (int spaces = row; spaces >= 2 ; spaces--) {
                System.out.print(" ");
            }
            for (int col = 1; col <= n - row + 1 ; col++) {
                System.out.print("*");//dont include space after * otherwise it will print a pyramid
            }
            System.out.println("");
         */
        /*
        6). Program to print inverted full pyramid pattern using star(*) in Java
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i-1 ; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        */

    }
}
/*
1 pant***
2 shaw***
3 iyer***
4 suryakumar
5 stokes
6 sam curran
7 axar***
8 sundar
9 ravi bishnoi
10rabada***
11nortje***
 */
