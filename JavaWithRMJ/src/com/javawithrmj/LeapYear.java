package com.javawithrmj;

import java.util.Scanner;

public class LeapYear {
    public static boolean isLeapYear(int year)
    {
        boolean is_leap_year = false;
        if (year % 4 == 0) {

            if (year % 100 == 0) {

                if (year % 400 == 0) {
                    is_leap_year = true;
                }

                else {
                    is_leap_year = false;
                }
            }

            is_leap_year = true;
        }

        if (!is_leap_year) {
            System.out.println(year + " : Non Leap-year");
        }

        else {
            System.out.println(year + " : Leap-year");
        }
        return is_leap_year;
    }

    public static void main(String[] args) {

        while (true){
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the year to find whether it is a leap year or not =");
            int year = in.nextInt();
            isLeapYear(year);
        }
    }
}

