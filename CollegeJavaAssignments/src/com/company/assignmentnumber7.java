package com.company;

import java.util.Scanner;
abstract class allFunctions{
        public static void prime(){
            int i,m=0,flag=0;
            Scanner in = new Scanner(System.in);
            System.out.print("Enter a number :");
            int n=in.nextInt();
            m=n/2;
            if(n==0||n==1){
                System.out.println(n+" is not prime number");
            }else {
                for (i = 2; i <= m; i++) {
                    if (n % i == 0) {
                        System.out.println(n + " is not prime number");
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    System.out.println(n + " is prime number");
                }
            }
        }

public static void stringpall(){
    String original, reverse = "";
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a string to check if it is a palindrome");
    original = in.nextLine();
    int length = original.length();
    for ( int i = length - 1; i >= 0; i-- )
        reverse += original.charAt(i);
    if (original.equals(reverse))
        System.out.println("Entered string is a palindrome.");
    else
        System.out.println("Entered string isn't a palindrome.");
}

public static void intpall(){
    int r,sum=0;
    Scanner in = new Scanner(System.in);
    int n=in.nextInt();

    int temp=n;
    while(n>0){
        r=n%10;
        sum=(sum*10)+r;
        n=n/10;
    }
    if(temp==sum)
        System.out.println("It is a palindrome number ");
    else
        System.out.println("It is not a palindrome");
}

public static void evenodd() {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a number = ");
    int n = in.nextInt();
    if(n%2 == 0)
        System.out.println("It is an even number ");
    else
        System.out.println("It is an odd number");
}

public static void inputarraystring() {
    Scanner in = new Scanner(System.in);
    String[] arr = new String[20];
    System.out.print("Enter the number of strings in array = ");
    int n = in.nextInt();
    for (int i = 0; i < n; i++) {
        System.out.printf("Enter the string number  %d : ",i+1);
        arr[i] = in.next();
    }
    System.out.print("Strings in array are = ");
    for (int i = 0; i < n; i++) {
        System.out.print(arr[i]+" ");
    }
}

public static void inputarraynum() {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the number of numbers = ");
    int i = in.nextInt();
    int[] arr = new int[i];
    for (int j = 0; j < i; j++) {
        System.out.print("Enter the num "+(j+1)+": ");
        arr[j] = in.nextInt();

    }
    System.out.print("Integer Array = ");
    for (int k = 0; k < i; k++) {
        System.out.print(arr[k]+" ");
    }
}
    }


public class assignmentnumber7 {

    public static void main(String[] args) {
        String s;
        Scanner sc =new Scanner(System.in);

        aa:
        while(true) {
            System.out.println("\n\t>>>>>>>>>>>>Welcome<<<<<<<<<<<<<");
            System.out.println("\n1\t==== MENU BAR ====\n\n\t1.Prime \n\t2.String Palindrome"
                    + "\n\t3.Integer Palindrome \n\t4.Even Odd"
                    + "\n\t5.String Array\n\t6.Integer Array\n\t7.Exit");

            System.out.print("Enter the number of choice = ");
            int c =sc.nextInt();


            switch(c) {

                case 1:	//prime
                    allFunctions.prime();
                    System.out.println("------------------------------------------------------------");
                    break;

                case 2: //string pall
                    allFunctions.stringpall();
                    System.out.println("------------------------------------------------------------");
                    break;


                case 3: //int pall
                    allFunctions.intpall();
                    System.out.println("------------------------------------------------------------");
                    break;

                case 4: //even odd
                    allFunctions.evenodd();
                    System.out.println("------------------------------------------------------------");
                    break;

                case 5: //string arr
                    allFunctions.inputarraystring();
                    System.out.println("------------------------------------------------------------");
                    break;

                case 6: //integer arr
                    allFunctions.inputarraynum();
                    System.out.println("------------------------------------------------------------");
                    break;


                case 7: //integer arr
                    System.out.println("------------------------------------------------------------");
                    break aa; // break aa loop, stop execution of program

                default: //default Statement
                    System.out.println("Invalid Input !!!"); //printing invalid input on console
                    System.out.println("------------------------------------------------------------");

            }
        }
    }
}
