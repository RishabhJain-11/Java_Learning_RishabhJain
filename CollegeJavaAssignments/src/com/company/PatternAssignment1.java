package com.company;

import java.util.Scanner;

public class PatternAssignment1 {
    public static void main(String[] args) {
        //Pattern Assignment
        Scanner in =new Scanner(System.in);

        aa:
        while(true) {
            System.out.println("\n\t==== MENU BAR ====\n\n\t1].Pattern1  \n\t2].Pattern2"
                    + "\n\t3].Pattern3 \n\t4].Pattern4"
                    + "\n\t5].Pattern5\n\t6].Exit");

            int c =in.nextInt();


            switch(c) {

                case 1:
                    System.out.print("Enter the Number :: ");
                    int n = in.nextInt();
                    pattern1(n);
                    System.out.println("======================================================");
                    break;

                case 2:
                    System.out.print("Enter the Number :: ");
                    n = in.nextInt();
                    pattern2(n);
                    System.out.println("======================================================");
                    break;


                case 3: //if input is 3
                    System.out.print("Enter the Number :: ");
                    n = in.nextInt();
                    pattern3(n);
                    System.out.println("======================================================");
                    break;

                case 4: //if input is 4
                    System.out.print("Enter the Number :: ");
                    n = in.nextInt();
                    pattern4(n);
                    System.out.println("======================================================");
                    break;

                case 5: //if input is 5
                    System.out.print("Enter the Number :: ");
                    n = in.nextInt();
                    pattern5(n);
                    System.out.println("======================================================");
                    break;

                case 6:
                    break aa;
                default: //default Statement
                    System.out.println("Invalid Input !!!");
                    System.out.println("======================================================");

            }
        }
    }



    static void pattern1(int n){
        int i = 0, temp = 0, j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for half pyramid: ");
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void pattern2(int n){
            int i=0,temp=0,j;
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter the number of rows for half pyramid: ");
            n= sc.nextInt();
            for(i=n;i>=1;i--){
                for(j=i;j>=1;j--){
                    System.out.print("*");
                }
                System.out.println("");
            }
    }

    static void pattern3(int n){
        int i=0,temp=0,j,k;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of rows for half pyramid: ");
        n= sc.nextInt();
        for(i=n;i>=1;i--){
            for(j=i;j>=2;j--){
                System.out.print(" ");
            }
            for(k=1;k<=n-i+1;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void pattern4(int n){
        int i=0,temp=0,j,k;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of rows for half pyramid: ");
        n= sc.nextInt();
        for(i=n;i>=1;i--){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void pattern5(int n){
        int i=0,temp=0,j,k;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of rows for pyramid: ");
        n= sc.nextInt();
        for(i=n;i>=1;i--){
            for(j=i;j>=2;j--){
                System.out.print(" ");
            }
            for(k=1;k<=2*(n-i+1)-1;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

