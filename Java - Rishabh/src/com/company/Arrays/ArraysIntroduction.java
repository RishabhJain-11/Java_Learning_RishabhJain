package com.company.Arrays;

public class ArraysIntroduction {
    public static void main(String[] args) {
/*
        // create an array
        int[] age = {12, 4, 5, 2, 5};

        // access each array elements
        System.out.println("Accessing Elements of Array:");
        System.out.println("First Element: " + age[0]);
        System.out.println("Second Element: " + age[1]);
        System.out.println("Third Element: " + age[2]);
        System.out.println("Fourth Element: " + age[3]);
        System.out.println("Fifth Element: " + age[4]);
*/
        // create an array
        int[] age = {12, 4, 5};
/*

        // loop through the array
        // using for loop
        System.out.println("Using for Loop:");
        for(int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }
*/
        /*
        System.out.println("Using for-each Loop:");
        for(int a : age) {
            System.out.println(a);
        }
         */

        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        int sum = 0;
        Double avg;

        for (int number:
             numbers) {
            sum += number;
        }

        int arraylength = numbers.length;

        avg = ((double)sum/(double)arraylength);

        System.out.println("Sum of all the numbers in Array is = "+sum);
        System.out.println("Average of all the numbers in Array is = "+avg);

    }
}
