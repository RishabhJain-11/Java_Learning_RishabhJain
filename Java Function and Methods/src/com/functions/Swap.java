package com.functions;

public class Swap {
    public static void main(String[] args) {

    int a =10;
    int b= 20;

//    //swap code
//    int temp =a;
//    a=b;
//    b=temp;
//
        swap(a,b);

        System.out.println(a+"  "+b);
    }

    static void swap(int num1 , int num2){
        int temp =num1;
        num1=num2;
        num2=temp;

    }
}
