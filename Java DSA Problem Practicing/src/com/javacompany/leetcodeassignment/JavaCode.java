package com.javacompany.leetcodeassignment;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaCode {

    public static void main(String[] args) {
        System.out.println();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Employee name = ");
        String name = in.nextLine();

        System.out.print("Enter the Employee Id = ");
        int id = in.nextInt();

        System.out.print("Enter the Employee Salary = ");
        int sal = in.nextInt();

        System.out.print("Enter the Employee Dept = ");
        String dept = in.next();

        System.out.print("Enter the Employee Address = ");
        String add = in.next();

        System.out.print("\nthe Employee name "+name);
        System.out.print("\nthe Employee id "+id);
        System.out.print("\nthe Employee salary "+sal);
        System.out.print("\nthe Employee dept "+dept);
        System.out.print("\nthe Employee address "+add);
    }

//public static void main(String[] args) throws IOException {
//
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.print("Enter emp name ");
//        String name = reader.readLine();
//
//        System.out.print("Enter emp id ");
//        int id = Integer.parseInt(reader.readLine());//**
//
//        System.out.print("Enter emp sal ");
//        int sal = Integer.parseInt(reader.readLine());//**
//
//        System.out.print("Enter emp dept ");
//        String dept = reader.readLine();
//
//        System.out.print("Enter emp add ");
//        String add = reader.readLine();
//
//
//    System.out.print("\nthe Employee name "+name);
//    System.out.print("\nthe Employee id "+id);
//    System.out.print("\nthe Employee salary "+sal);
//    System.out.print("\nthe Employee dept "+dept);
//    System.out.print("\nthe Employee address "+add);
//}
}
