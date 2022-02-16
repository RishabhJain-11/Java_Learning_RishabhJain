package com.functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        sum();
//        int ans = sum2();
//        System.out.println(ans);
        int ans = sum3(20,30);
        System.out.println(ans);
    }
    //pass the value of numbers when you calling it in main
    static int sum3(int a ,int b){
        int sum = a+b;
        return sum ;
    }




    static int sum2(){

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the firdt no :");
        int num1 = in.nextInt();
        System.out.println("Enter the secind number :");
        int num2 = in.nextInt();

        int sum = num1 + num2;
//        System.out.println("sum = "+sum);
        return sum;
    }

    static void sum(){

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the firdt no :");
        int num1 = in.nextInt();
        System.out.println("Enter the secind number :");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        System.out.println("sum = "+sum);
    }



}
        /*access modifier   return type  name() {

        //body
        //return statement;
        }
         */
