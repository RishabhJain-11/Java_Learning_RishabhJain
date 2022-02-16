package com.company;

import java.util.Scanner;

//Example 11: Java Program to Check a Leap Year
public class LeapYear {
    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        System.out.print("Enter a year = ");
        int year = in.nextInt();
        boolean l = true;
        l = year % 4 == 0 && year % 100 == 0 && year % 400 == 0;
        if(l){
            System.out.println("It is a leap year ");
        }
        else {
            System.out.println("Not a leap year");
        }*/
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a year = ");
        int year = in.nextInt();
        boolean leap = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }

        else
            leap = false;

        if (leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}
/*
public class Main {

  public static void main(String[] args) {

    // year to be checked
    int year = 1996;
    boolean leap = false;

    // if the year is divided by 4
    if (year % 4 == 0) {

      // if the year is century
      if (year % 100 == 0) {

        // if year is divided by 400
        // then it is a leap year
        if (year % 400 == 0)
          leap = true;
        else
          leap = false;
      }

      // if the year is not century
      else
        leap = true;
    }

    else
      leap = false;

    if (leap)
      System.out.println(year + " is a leap year.");
    else
      System.out.println(year + " is not a leap year.");
  }
}
 */
