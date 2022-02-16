package com.recursion1;

public class Main {

    public static void main(String[] args) {
	// write your code here
        funBoth(5);

    }
//from  here you can debug
    static void fun(int n){//here the stack is waiting for the function to execute complete
        if(n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }


    static void funrev(int n){//here the stack is waiting for the function to execute complete
        if(n==0){
            return;
        }
        funrev(n-1);//this will first call the funrev function and then it is going to wait in the stack after the return becomes false it is going to print the elements in the functions
        System.out.println(n);
    }


    static void funBoth(int n){//here the stack is waiting for the function to execute complete
        if(n==0){
            return;
        }
        System.out.println(n);
        funBoth(n-1);
        System.out.println(n);
    }
}
