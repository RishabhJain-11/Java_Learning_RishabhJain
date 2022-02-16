package com.rishabh;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        // for loops
        // Q . print numbers from 1 to 5
//        for (int num = 1; num <=5 ; num++) {
//            System.out.println(num);
//        }
//        Scanner in = new Scanner(System.in);
//        int n =  in.nextInt();
//
//        for (int num = 1; num <= n ; num++) {
//            System.out.print(num + "  ");
//
//        }
//    }
//        int n = 1;
//        while (n <= 5) {
//            System.out.println(n);
//            n++;
//        }
        // the good thing about do - while loop is that it will execute at least once.
        int n=1;
        do {
            System.out.println("Hello World !");
            n++;
        }while (n<=5);
    }
}
