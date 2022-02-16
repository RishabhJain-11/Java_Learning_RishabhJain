package com.functions;

public class Overloading {
    public static void main(String[] args) {
       fun(4);
       fun("Rishabh JAin");
    }
    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String b){
        System.out.println(b );
    }
}
