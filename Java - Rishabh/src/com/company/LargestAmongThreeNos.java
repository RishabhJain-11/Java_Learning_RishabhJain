package com.company;

import java.util.Scanner;

//Q9 Java Program to Find the Largest Among Three Numbers
public class LargestAmongThreeNos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if(a>b && a>c){
            System.out.println(a+" is Greatest amongst three");
        }
        else if(b>a && b>c){
            System.out.println(b+" is Greatest amongst three");
        }
        else{
            System.out.println(c+" is Greatest amongst three");
        }

    }
}
