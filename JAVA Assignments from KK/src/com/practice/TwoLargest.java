package com.practice;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class TwoLargest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Print the first number ");
        int a = in.nextInt();
        System.out.print("Print the second number ");
        int b = in.nextInt();

        int max;

        if(a>b){
            max=a;

        }
        else{
            max=b;
        }
        System.out.println("The largest number amongst the two is :"+max);
    }

}
