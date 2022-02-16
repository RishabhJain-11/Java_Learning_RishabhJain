package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[] arr = new int[5];
//        arr[0] = 233;
//        arr[1] = 3333;
//        arr[2] = 2343;
//        arr[3] = 2336;
//        arr[4] = 2333;
//        System.out.println(arr[3]);


        //input using for loops
//        for (int i = 0 ; i< arr.length ; i++){
//            arr[i]=in.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));

        //output using for loops
//        for (int j : arr) {                for every element in array print the array
//            System.out.println(j + " ");//here num represents element of the array
//        }

        String[] str = new String[4];
        for(int i =0 ; i<str.length;i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        //modify
//        str[1] = "Aman";
//        System.out.println(Arrays.toString(str));
    }
}
