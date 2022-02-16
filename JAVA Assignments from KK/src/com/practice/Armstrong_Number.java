package com.practice;

import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        int num , org_num , remainder , result=0;
        Scanner in = new Scanner(System.in);

        num = in.nextInt();
//        org_num = in.nextInt();
//        remainder = in.ne1xtInt();
//        num = in.nextInt();


        org_num = num;
        while(org_num != 0){
            remainder = org_num %10;
            result += Math.pow(remainder, 3);
            org_num /= 10;

        }
        if(result == num){
            System.out.println(num+" is an armstrong number.");
        }
        else{
            System.out.println(num+" it is not an armstrong number .");
        }


    }
}
