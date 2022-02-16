package com.functions;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.println("Enter a number :");

        int num = in.nextInt();

        if(isPrime(num)){
            System.out.println("The number is prime.");
        }else{
            System.out.println("Thr number is not prime.");
        }
    }

    static boolean isPrime(int n)
    {
        // Corner cases
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;

        // This is checked so that we can skip
        // middle five numbers in below loop
        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }
}
