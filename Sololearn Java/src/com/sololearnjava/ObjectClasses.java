package com.sololearnjava;

import java.util.Scanner;

public class ObjectClasses {
    static int sayHello(int val1 , int val2){
//        String name
            return val1+val2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int x = sayHello(a,b);
        System.out.println("sum = "+x);
    }
}
