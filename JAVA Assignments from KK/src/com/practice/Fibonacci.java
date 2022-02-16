package com.practice;

public class Fibonacci
{
    static int a=1,b=0,c=1;
    static void printFib(int count){
        if(count > 0)
        {
            c = a+b;
            a=b;
            b=c;
            System.out.println(" "+c);

            printFib(count-1);
        }


    }

    public static void main(String[] args) {
        int count = 10;
        System.out.println(a+" "+b);
        printFib(count-2);
    }
}
