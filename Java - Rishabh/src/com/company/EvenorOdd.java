package com.company;
//Q7 even or odd
import java.util.Scanner;

public class EvenorOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        String evenOdd = (n%2==0) ?"even":"odd";
        System.out.println(n+" is "+evenOdd);

    }
}
