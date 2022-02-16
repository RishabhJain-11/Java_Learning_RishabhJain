package com.MathsforDSA2;

import java.util.ArrayList;
import java.util.Arrays;

public class FactorialOfNumber {
    public static void main(String[] args) {
        factorial3(20);
    }
    //O(n)
    static void factorial(int n ){
        for (int i = 1; i <= n ; i++) {
            if(n%i == 0){
                System.out.print(i+" ");
            }
        }
    }
    static void factorial2(int n ){
        for (int i = 1; i <=Math.sqrt(n) ; i++) {
           if (n%i == 0){
                if (n / i == i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " " + n / i+" ");
                }
            }
        }
    }
    static void factorial3(int n ){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <=Math.sqrt(n) ; i++) {
           if (n%i == 0){
                if (n / i == i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }
        }
        for (int i = list.size()-1; i >= 0 ; i--) {
            System.out.print(list.get(i)+" ");
        }
    }
}
