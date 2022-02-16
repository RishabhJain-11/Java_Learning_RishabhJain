package com.rishabh;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String inf = sc.next();
//
//
//        //enhanced switch statements
//        switch (inf) {
//            case "Kunal" -> System.out.println("Java teacher");
//            case "Aman" -> System.out.println("A motivational speaker");
//            case "Love" -> System.out.println("Off - Campus Advisor");
//            case "Anuj" -> System.out.println("Roadmap Expert");
//            default -> System.out.println("Enter a Valid influencer's name !");
//        }

        Scanner in = new Scanner(System.in);
        String Department = in.next();
        int empId = in.nextInt();

        switch (empId) {
            case 1 -> System.out.println("Rishabh");
            case 2 -> System.out.println("Aman");
            case 3 -> {
                System.out.println("Atharva");
                switch (Department) {
                    case "IT" -> System.out.println("It Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No valid department entered.");
                }
            }
            default -> System.out.println("No employee entered.");
        }

    }
}
