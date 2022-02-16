package com.company;

import java.util.Scanner;

public class squareRoot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int inp = in.nextInt();

        int sqr = mySqrt(inp);
        System.out.println(sqr);
    }
    static public int mySqrt(int x) {

        int sq = (int) Math.pow(x,0.5);
        return sq;
    }
}
