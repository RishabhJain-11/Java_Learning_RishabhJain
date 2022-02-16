package com.practice;

import java.util.Scanner;

public class LArgest_Smallest_numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number = ");
        int a = in.nextInt();

        System.out.println("Enter the second number = ");
        int b = in.nextInt();

        System.out.println("Enter the third number = ");
        int c = in.nextInt();

        int largest = largest(a, b, c);
        int smallest = smallest(a, b, c);



        System.out.printf("The largest of the three numbers are %d ,%d, and %d is : %d %n",a, b, c,largest);
        System.out.printf("The smallest of the three numbers are %d ,%d, and %d is %d %n",a,b,c,smallest);

    }

    public static int largest (int a , int b , int c){
        int max = a;

        if(b>max){
            max = b;
        }
        if(c>max){
            max = c;
        }
        return max;
    }


    public static int smallest (int a , int b , int c){
        int min = a;

        if(min > b){
            min = b;
        }
        if(c<min){
            min = c;
        }
        return min;
    }
}
