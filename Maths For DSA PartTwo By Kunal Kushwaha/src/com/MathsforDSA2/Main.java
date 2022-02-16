package com.MathsforDSA2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i+"  "+isPrime(i));
        }

    }

    static boolean isPrime(int n ){
        if(n<= 1){
            return false;
        }

        int c=2;
        while (c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
/*
1*36
2*18
....
 */
