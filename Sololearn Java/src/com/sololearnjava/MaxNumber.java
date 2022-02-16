package com.sololearnjava;

public class MaxNumber {
    public static void main(String[] args) {
        int m = max(45345827,345232363);
        System.out.println("The maximum amongst the two is = " + m);
    }
    static int max(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
}
