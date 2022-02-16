package com.practice;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        float result;
        Scanner in = new Scanner(System.in);

        String ch = in.next();

        System.out.println("Enter the first number:");
        float num1 = in.nextFloat();


        System.out.println("Enter the second number:");
        float num2 = in.nextFloat();

        if( ch=="+"){

            result=num1+num2;
            System.out.println("the addition of two numbers :" +result);
        }if( ch=="-"){

            result=num1-num2;
            System.out.println("the subtraction of two numbers :" +result);
        }if( ch=="*"){

            result=num1*num2;
            System.out.println("the multiplication of two numbers :" +result);
        }if( ch=="/"){

            result=num1+num2;
            System.out.println("the division of two numbers :" +result);
        }
    }
}
