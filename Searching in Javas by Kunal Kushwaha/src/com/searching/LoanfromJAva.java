package com.searching;

import java.util.Scanner;

public class LoanfromJAva
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        //your code goes here
        int pending = 0;
        for(int i=0;i<3;i++){
            pending=amount/10;
            amount-=pending;
        }
        System.out.println(amount);
    }
}
