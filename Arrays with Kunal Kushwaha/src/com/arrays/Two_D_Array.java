package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Two_D_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        1 2 3
        4 5 6
        7 8 9
         */
        //adding the rows is mandatory
        //columns is not mandatory

//        int[][] arr = new int[3][];

//         int[][] arr = {
//                 {1,2,3},//0th index
//                 {4,5,6},//1st index
//                 {7,8,9} //2nd index
//        };
//        System.out.println(Arrays.toString(arr));

        //input

        int [][] arr = new int [3][3];
        System.out.println(arr.length);//number of rows


        for(int row = 0 ;row<arr.length ;row++){
            for(int col = 0; col < arr[row].length ;col++){
                arr[row][col] = in.nextInt();
            }
        }

//output
//        for (int[] ints : arr) {
//            for (int col = 0; col < ints.length; col++) {
//                System.out.print(ints[col] + " ");
//            }
//            System.out.println();


//        for (int i = 0, arrLength = arr.length; i < arrLength; i++) {
//            int[] ints = arr[i];
//            for (int col = 0; col < ints.length; col++) {
//                System.out.print(ints[col] + " ");
//            }
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
        }
        }


