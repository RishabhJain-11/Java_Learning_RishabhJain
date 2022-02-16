package com.practice;

import java.util.Scanner;

public class Batting_Average {
    static int batting(int runs , int matches , int notout){

        int out = matches - notout;

        return runs / out;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Runs =");
        int R = in.nextInt();

        System.out.print("Matches =");
        int M = in.nextInt();

        System.out.print("Not Out =");
        int N = in.nextInt();


        System.out.println("Average = "+batting(R,M,N));

    }
}
