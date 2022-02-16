package com.practice;

import java.util.Scanner;

public class Discount_Price {
//    static int dis_pri(int mar,int pri){
//
//
//        int dis = mar - pri;
//        float dis_per;
//        dis_per = (dis/mar)*100;
//
//        return dis;
//    }
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
////        System.out.print("Enter the discount :");
////        int dis = in.nextInt();
//
//        System.out.print("Enter the marked price :");
//        int mar = in.nextInt();
//
//        System.out.print("Enter the selling price :");
//        int pri = in.nextInt();
//
//        int dis = 0;
//        System.out.println("The discount is :"+dis);
//        System.out.println("The discount per is :"+dis_pri(mar,pri));
//
//
//    }



    static float discount_Per(float S , float M){
        float discount = M - S;

        float dis_per = (discount/M)*100;

        return dis_per;
    }

    public static void main(String[] args) {
        float M , S;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the MRP :");
         M = in.nextFloat();

        System.out.print("Enter the Selling Price :");
         S = in.nextFloat();

        System.out.printf("The discount rate is : %2f",discount_Per(S,M));

    }
}




















//
//
//Discount = Marked Price - Selling price
//
//        Therefore,
//        Discount Percentage = (Discount / Marked Price) * 100