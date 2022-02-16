package com.functions;

import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);

        System.out.print("Enter the radius please =");

        int rad = in.nextInt();

        int circum = cal_cir( rad);
        System.out.println("The circumference of the circle is :"+circum);

        int area = cal_are( rad);
        System.out.print("The area of the circle is :"+area);
    }

    static int cal_cir(int r ){
        int cir = (int) (2*3.14*r);
//        int are = (int) (3.14*r*r);
        return cir ;
    }


    static int cal_are(int ra ){
//        int cir = (int) (2*3.14*r);
        int are = (int) (3.14*ra*ra);
        return are ;
    }
}
