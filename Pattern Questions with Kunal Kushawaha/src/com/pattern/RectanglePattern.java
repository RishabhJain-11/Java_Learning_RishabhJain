package com.pattern;

import java.util.Scanner;

public class RectanglePattern {
    public static void main(String[] args) {
//        System.out.println("");
        System.out.println("This  is a Hollow Rectangle Pattern");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows = ");
        int rows = in.nextInt();

        System.out.print("Enter the number of columns = ");
        int col = in.nextInt();
/*
1). Program to print Solid Rectangle using star(*) in Java
        for (int i = 1; i <= rows ; i++) {
            for (int j = 1; j <= col ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
 */
        for (int i = 1; i <= rows ; i++) {
            for (int j = 1; j <= col ; j++) {
                if (i==1 || i==rows || j==1 || j==col){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
/*
        for(i=1; i<=rows; i++)
        {
            for(j=1; j<=columns; j++)
            {
                if(i==1 || i==rows || j==1 || j==columns)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
*/
//1 2 3 4 5 6 7 8 9 16 10 11 20 21 28
//12 13 14 15 17 18 19 22 23 24 25 26 27 29 30 31 32 33 34 35
