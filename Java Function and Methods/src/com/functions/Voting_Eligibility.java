package com.functions;

import java.util.Scanner;

public class Voting_Eligibility {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your Age :");
        int age = in.nextInt();
        System.out.println();
        if(age>= 18){
            System.out.println("You are eligible to vote :) !!!");
        }
        else{
            System.out.println("Sorry you are not grown up to vote now .:(");
        }
    }
}

