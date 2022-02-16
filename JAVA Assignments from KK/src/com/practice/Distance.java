package com.practice;

import java.util.Scanner;

public class Distance {
    static double distance(int x1, int x2 , int y1 , int y2){
        return Math.sqrt(Math.pow(x2 - x1,2)+Math.pow(y2-y1,2)*1.0);
    }

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int x1 = in.nextInt();
//        int x2 = in.nextInt();
//        int y1 = in.nextInt();
//        int y2 = in.nextInt();

        System.out.println(Math.round(distance(6,4,2,5)*100000)/100000);

    }
}
