package com.recursion;

public class NumbersExample {
    public static void main(String[] args) {
        //print numbers that takes a number and prints it
        //print first 5 numbers = 1 2 3 4 5
        print1(1);
    }

    static void print1(int n){
        System.out.println(n);
        print2(9);
    }
    static void print2(int n){
        System.out.println(n);
        print3(2);
    }
    static void print3(int n){
        System.out.println(n);
        print4(3);
    }
    static void print4(int n){
        System.out.println(n);
        print5(4);
    }
    static void print5(int n){
        System.out.println(n);
        print6(5);
    }
    static void print6(int n){
        System.out.println(n);
    }

}
/*
while the function is not finished executing it will remain in stack
 */

/*
ishan
rohit
kohli
rahul
pant
pandya*
axar*
jadeja*
shami
bhuvi
bumrah

surya
chahar
ashwin
chakravarthy

 */

/*
20000+
70000+
5000
=100000
 */

























