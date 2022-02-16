package com.company;
//Q6.swap two numbers
public class SwapTwoNumbers {
    public static void main(String[] args) {
        float a=5.67f,b=45.6f;

        System.out.println("---Before Swap ---");
        System.out.println("First = "+a);
        System.out.println("Second = "+b);

        a = a - b;
        b = a + b;
        a = b - a;
/*
        this is the first approach---
        float temp = a;
        a = b;
        b= temp;

 */
        /*
        second thought process can be --
        first = first - second;
        second = first + second;
        first = second - first;
         */

        System.out.println("---After Swap ---");
        System.out.println("First = "+a);
        System.out.println("Second = "+b);

    }
}
