package com.company;

import java.util.Scanner;

public class NumberInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a  number :");
        int num = in.nextInt();
        System.out.println("You have enterd = "+num);
    }

}
