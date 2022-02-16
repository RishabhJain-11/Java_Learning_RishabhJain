package com.practice;

import java.util.Scanner;

public class Average_Numbers {

    static float avg_num(int num){
        return (float)(1+num)/2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number for the average :");
        int num = in.nextInt();

        System.out.println("Average :"+avg_num(num));

    }
}
