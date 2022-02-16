package com.functions;

import java.util.Scanner;

public class PrimeBetweenTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int flag;
        System.out.print("Enter the lower bound :");
        int a = in.nextInt();

        System.out.print("Enter the upper bound :");
        int b = in.nextInt();

        System.out.printf("The prime numbers between %d and %d are ", a, b);

        if (a == 1) {
            System.out.println(a);
            a++;
            if (b >= 2) {
                System.out.println(a);
                a++;

            }
        }
        if(a==2)
            System.out.println(a);
//            a++;
        if (a%2==0)
            a++;

        for (int i = a; i <= b ; i++) {
            flag = 1;

            for(int j =2;j*j<=i;j++){
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if(flag==1)
                System.out.println(i);
        }
    }
}
