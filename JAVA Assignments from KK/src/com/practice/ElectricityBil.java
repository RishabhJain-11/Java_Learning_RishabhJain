package com.practice;

import java.util.Scanner;

public class ElectricityBil {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the consumed :");
//        int unit = in.nextInt();
//        int bill;
//        if(unit >= 0  && unit<=100){
//            bill = unit * 10;
//        }
//        else if (unit >= 100  && unit<=200){
//            bill = unit *15;
//        }
//        else if (unit >= 200  && unit<=300){
//            bill = unit *20;
//        }
//        else{
//            bill = unit*25;
//        }
//        System.out.println("Total Bill = Rs "+bill);
//    }


    public static int calBill(int unit){

        if(unit<=100){
            return (unit * 10);
        }
        else if ( unit<=200){
            return (100 * 10) + ((unit - 100)*15);
        }
        else if (unit<=300){
            return (100 * 10) + (100 * 15) + (( unit - 200)*20);
        }
        else{
            return (100 * 10)
                    + (100 * 15)
                    + (100 * 20)
                    + (unit - 300)
                    * 25;
        }

    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int unit = in.nextInt();
        System.out.println(
                calBill(unit));
    }
}
