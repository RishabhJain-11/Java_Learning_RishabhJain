package com.functions;

import java.util.Scanner;

public class SumOfNNaturalNumbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = in.nextInt();
        int addint = sum(num);
        System.out.println("The sum of N natural numbers are :"+addint);
    }

    static int sum(int num)
    {
        int add = 0 ;
        for (int i = 1; i <= num; i++)
            add += i;
            return add;

    }
}
