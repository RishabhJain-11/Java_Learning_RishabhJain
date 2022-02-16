package com.javawithrmj;

import java.util.Scanner;

public class Factorial {
static int factorialRecu(int n){
    if (n == 0)
        return 1;
    else
        return(n * factorialRecu(n-1));
}
static int factorialIter(int n){
    int i,fact=1;
    for(i=1;i<=n;i++){
        fact=fact*i;
    }
    return fact;
}
    public static void main(String[] args) {
        int c;
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println();
            System.out.println("**** FACTORIAL FUNCTION ****");
            System.out.print("1.Recursive \n2.Iterative \n3.Exit");
            System.out.print("\n\nEnter your Choice ::");
            c=sc.nextInt();
            System.out.println("----------------------------------------------------------");
            if(c==1||c==2||c==3) {
                System.out.print("\nEnter the function number to be Transfer :: ");
                System.out.println("----------------------------------------------------------");
            }
            switch (c) {
                case 1 -> {
                    int i,fact=1;
                    System.out.print("Enter the number for the factorial = ");
                    int number= sc.nextInt();
                    fact = factorialRecu(number);
                    System.out.println("Factorial of "+number+" is: "+fact);
                }
                case 2 -> {
                    int i,fact=1;
                    System.out.print("Enter the number for the factorial = ");
                    int number= sc.nextInt();
                    fact = factorialIter(number);
                    System.out.println("Factorial of "+number+" is: "+fact);
                }
                case 3 -> {
                    System.out.println("\nThank you For Performing !!!! ");
                    System.out.println("----------------------------------------------------------");
                    return;
                }
                default -> {
                    System.out.println("Invalid  Mode !!!");
                    System.out.println("----------------------------------------------------------");
                }
            }
        }
    }
}

