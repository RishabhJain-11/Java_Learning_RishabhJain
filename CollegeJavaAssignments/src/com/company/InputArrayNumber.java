package com.company;

import java.util.Scanner;

public class InputArrayNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of numbers = ");
        int i = in.nextInt();
        int[] arr = new int[i];
        for (int j = 0; j < i; j++) {
            System.out.print("Enter the num "+(j+1)+": ");
            arr[j] = in.nextInt();

        }
            System.out.print("Integer Array = ");
            for (int k = 0; k < i; k++) {
                System.out.print(arr[k]+" ");
            }
    }
}
