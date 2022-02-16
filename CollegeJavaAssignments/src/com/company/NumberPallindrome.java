package com.company;

import java.util.Scanner;

public class NumberPallindrome {
    public static void main(String[] args){
        int r,sum=0;
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();

        int temp=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
            System.out.println("It is a palindrome number ");
        else
            System.out.println("It is not a palindrome");
    }
}

