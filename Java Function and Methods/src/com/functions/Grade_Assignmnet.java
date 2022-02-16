package com.functions;

import java.util.Scanner;

public class Grade_Assignmnet {
    public static void main(String[] args) {
        float totalMarks = 0, percentage, average;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the total number of your subjects :");
        int count = in.nextInt();

        System.out.println("Enter the marks of "+count+" subjects.");
        for (int i = 0; i < count; i++) {
            totalMarks += in.nextInt();

        }
        System.out.println("the total marks are = "+totalMarks);
        percentage = (totalMarks / (count * 100)) * 100;

        switch ((int) percentage / 10) {
            case 9 -> System.out.println("Grade : A+");
            case 8 -> System.out.println("Grade : A");
            case 7 -> System.out.println("Grade : B");
            case 6 -> System.out.println("Grade : C");
            default -> System.out.println("Grade : D");
        }
    }
}
