package com.practice;

import java.util.Scanner;

public class Calculate_Commission {
    public static void main(String[] args) {
//        double amount = 1000,percent=15;//using standard values





        Scanner in = new Scanner(System.in);//using scanner

        System.out.println("Enter the amount :");
        double amount = in.nextDouble();

        System.out.println("Enter the commission percentage :");
        double percent = in.nextDouble();



//        double amount = Double.parseDouble(args[0]);
//        double percent = Double.parseDouble(args[1]);




//        double commission = (amount * percent)/100;
        double commission=(percent/100)*amount;
        System.out.println("The commission is :"+commission);
    }

}
