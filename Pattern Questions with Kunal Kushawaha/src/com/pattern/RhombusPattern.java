package com.pattern;

import java.util.Scanner;

public class RhombusPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number of rows for Rhombus = ");
        int n = in.nextInt();
        /*
        1). Program to print right Inclined Solid Rhombus using star(*) in Java
        for (int i = 0; i < n; i++) {
            for (int k = 1; k < n-i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= n; j++) {
                System.out.print("*");
            }

            System.out.println("");

         */
        //2). Program to print left inclined Solid Rhombus using star(*) in Java
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= n ; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        }
    }

    /*
    import java.util.*;
class Main{
    public static void main(String ...a){
    int i,j,k;
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the number of rows for Rhombus: ");
    int n= sc.nextInt();
    for(i=n;i>=1;i--){
		    for(j=1;j<=n-i;j++){
                     System.out.print(" ");
		    }
		    for(k=1;k<=n;k++){
		        System.out.print("*");
		}
		 System.out.println("");
	    }
    }
}
     */

