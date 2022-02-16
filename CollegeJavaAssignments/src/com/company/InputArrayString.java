package com.company;

import java.util.Scanner;

public class InputArrayString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] arr = new String[20];
        System.out.println("Enter the number of strings in array = ");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the string number  %d : ",i+1);
            arr[i] = in.next();
        }
        System.out.print("Strings in array are = ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
