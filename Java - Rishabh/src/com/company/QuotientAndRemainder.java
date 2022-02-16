package com.company;
//Quotient and Remainder
//Q5

public class QuotientAndRemainder {
    public static void main(String[] args) {
       int a,b;
       a=30;
       b=12;

       int quotient  = a%b;
       int remainder = a/b;
        System.out.printf("Remainder = %d",remainder);
        System.out.printf("\nRemainder = %d",quotient);
    }
}
/*
public class QuotientRemainder {

  public static void main(String[] args) {

    int dividend = 25, divisor = 4;

    int quotient = dividend / divisor;
    int remainder = dividend % divisor;

    System.out.println("Quotient = " + quotient);
    System.out.println("Remainder = " + remainder);
  }
}
 */
