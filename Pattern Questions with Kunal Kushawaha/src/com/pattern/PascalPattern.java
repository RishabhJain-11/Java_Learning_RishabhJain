package com.pattern;

import java.util.Scanner;

public class PascalPattern {
    public static void main(String[] args) {
        int temp = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the  no. of rows = ");
        int n = in.nextInt();


        for (int i = 0; i < n ; i++) {
            for (int k = 1; k <= n-i ; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                if (j==0 || i == 0)
                    temp = 1;
                else
                    temp = temp * (i-j+1)/j;
                System.out.print(" "+temp);
            }
            System.out.println("");
        }
    }
}
/*
for (i=0; i<n; i++) {
        for (k=1; k <= n-i; k++)
        {
            System.out.print(" ");
        }
        for (j=0; j<=i; j++) {
            if (j==0 || i==0)
                temp = 1;
            else
                temp=temp*(i-j+1)/j;
            System.out.print(" "+temp);
           }
        System.out.println("");
	    }
 */
