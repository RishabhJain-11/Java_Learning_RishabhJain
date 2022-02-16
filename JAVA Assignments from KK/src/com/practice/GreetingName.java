package com.practice;

import java.util.Scanner;

public class GreetingName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your name please : ");
        String name = in.next();

        System.out.println("Hello ,How are you Mr "+name);
    }
}
