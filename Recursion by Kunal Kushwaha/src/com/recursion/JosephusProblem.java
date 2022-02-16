package com.recursion;

public class JosephusProblem {
    public static void main(String[] args) {
        int n = 14;
        int k = 2;
        System.out.println("The safest place is : "+josephus(n,k));
    }
    public static int josephus(int n ,int k){
        if(n == 1 || n == 0)
            return 1;
        else
            return (josephus(n-1,k)+ k-1)%n+1;
    }
}

