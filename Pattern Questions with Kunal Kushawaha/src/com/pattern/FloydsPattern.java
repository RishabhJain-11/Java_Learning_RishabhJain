package com.pattern;

import java.util.Scanner;

public class FloydsPattern {
    public static void main(String[] args) {
        int k= 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number of Rows = ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" "+ k++);
            }
                System.out.println("");
        }
    }
}
