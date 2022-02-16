package com.recursion1;

public class Concept {
    public static void main(String[] args) {
        con(5);
    }
    static void con(int n ){
        if(n==0)
            return;
        System.out.println(n);
        con(--n);
    }
}
