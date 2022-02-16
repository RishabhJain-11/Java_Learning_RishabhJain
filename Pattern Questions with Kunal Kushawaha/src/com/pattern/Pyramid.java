package com.pattern;

import java.util.Scanner;
/*
public class Pyramid {
        public static void pyramidPattern(int n){
        int i;
            for (i = 0; i < n; i++) {
                for (int j = n - i; j > 1; j--) {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        pyramidPattern(n);
    }
}*/

public class Pyramid
{
    public static void pyramidPattern(int n)
    {
        int i;
        for (i=0; i<n; i++) //outer loop for number of rows(n)
        {
            for (int j = n - i; j > 1; j--) //inner loop for spaces
            {
                System.out.print(" "); //print space
            }
        }
        for (int j=0; j<=i; j++ ) //inner loop for number of columns
        {
            System.out.print("* "); //print star
        }

        System.out.println(); //ending line after each row
    }


    public static void main(String[] args) //driver function
    {
        int n = 5;
        pyramidPattern(n);
    }
}

/*
public class Edureka
{
    public static void pyramidPattern(int n)
    {
        for (int i=0; i<n; i++) //outer loop for number of rows(n) { for (int j=n-i; j>1; j--) //inner loop for spaces
            {
                System.out.print(" "); //print space
            }
            for (int j=0; j<=i; j++ ) //inner loop for number of columns
            {
                System.out.print("* "); //print star
            }

            System.out.println(); //ending line after each row
        }
    }

    public static void main(String args[]) //driver function
    {
        int n = 5;
        pyramidPattern(n);
    }
}
 */