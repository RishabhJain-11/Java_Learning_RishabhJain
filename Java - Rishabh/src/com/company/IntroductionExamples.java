package com.company;

import java.util.Scanner;

public class IntroductionExamples {
    public static void main(String[] args) {
        //multiply
        /*
        Scanner in = new Scanner(System.in);


        int a = in.nextInt();
        int b = in.nextInt();

        int multiply = a * b;

        System.out.println("Multiplication = "+multiply);

         */

        //find quotient and remainder
        /*
        Scanner in = new Scanner(System.in);


        int a = in.nextInt();
        int b = in.nextInt();

        int remainder = a%b;

        System.out.println("Remainder = "+remainder);

        int quotient = a/b;
        System.out.println("Quotient = "+quotient);
         */


        //use of ++ and -- operators
        /*
        Scanner in = new Scanner(System.in);


        int a = in.nextInt();
        int b = in.nextInt();

        ++a;
        --b;

        System.out.println(a);
        System.out.println(b);
        */


        //Swap two numbers
        Scanner in = new Scanner(System.in);


        int a = in.nextInt();
        int b = in.nextInt();

        int temp = a;
        a=b;
        b=temp;

        System.out.println("number1 = "+a);
        System.out.println("number2 = "+b);

    }
}

/*
JAVA INTRODUCTION : QUIZ

1 WHAT IS THE STARTING POINT OF A JAVA PROGRAM ?
ANS : public static void main(String[] args)

2 WHAT IS THE CORRECT WAY TO PRINT A VARIABLE IN JAVA ?
ANS : System.out.println("number1 = "+a);



 */
