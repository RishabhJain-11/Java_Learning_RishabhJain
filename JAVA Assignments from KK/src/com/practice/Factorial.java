package com.practice;
import javax.security.sasl.SaslClient;
//import  java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        //using a for loop
//        Scanner in = new Scanner(System.in);
//        int num = in.nextInt();
//
//
//    long factorial =1;
//    for(int i = 1; i<=num ; i++){
//        factorial*=i;
//
//    }
//        System.out.printf("The factorial of %d = %d",num,factorial);







        // By Using BIGINTEGER
//        Scanner in = new Scanner(System.in);
//        int num = in.nextInt();
//
//        BigInteger factorial = BigInteger.ONE;
//
//        for(int i = 1; i<=num ; i++){
//            factorial = factorial.multiply(BigInteger.valueOf(i));
//
//        }
//
//        System.out.printf("The Factorial of %d = %d",num,factorial);




        //BY USING WHILE LOOP
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int i =1;
        long factorial = 1;
        while (i<=num){
            factorial*=i;
            i++;

        }
        System.out.printf("The factorial of %d = %d",num,factorial);
    }
}
























