package com.sololearnjava;

import java.util.Scanner;

public class Conditionala {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your age :");
        int age = in.nextInt();

        System.out.print("Enter Your salary :");
        int sal = in.nextInt();

        if (age <18 && sal<5000){
            System.out.println("You are welcome as a junior contributor !");
        }else if (age<=30 || sal<10000){
            System.out.println("Senior Contributor!");
        }
        else {
            System.out.println("You rest at home !");
        }
        /*
        The OR operator (||) checks if any one of the conditions is true.The condition becomes true, if any one of the operands evaluates to true.
        The NOT !) logical operator is used to reverse the logical state of its operand. If a condition is true, the NOT logical operator will make it false.
         */

    }
}
