package com.pattern;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of row for half diamond = ");
        int n = in.nextInt();
        /*
        for (int i = 1; i <= n ; i++) {
            for (int k = 1; k <= i ; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        for (int i = n; i > 1; i--) {
            for (int k = i; k > 1; k--) {
                System.out.print("* ");
            }
            System.out.println("");
        }

         */
        /*

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }



        for (int i = n-1; i > 0; i--) {
            for (int j = n; j >= i ; j--) {
                System.out.print(" ");
            }
            for (int k = i; k > 0 ; k--) {
                System.out.print("*");
            }
            System.out.println("");
        }

         */
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2*i+1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = n-1; i < 2*i+1; i--) {
            for (int j = n-1; j >= i ; j--) {
                System.out.print(" ");
            }

            for (int k = 2*i-1; k >0 ; k--) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }
}
