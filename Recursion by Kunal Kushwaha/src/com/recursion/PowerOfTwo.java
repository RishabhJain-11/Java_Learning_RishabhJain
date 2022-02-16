package com.recursion;
//Recursion
public class PowerOfTwo {
    public static void main(String[] args) {

        System.out.println(Power(8));
    }
    static boolean Power(int n){
        if(n<=0)
            return false;
//        return n>0 && (n==1 || (n%2 == 0 && Power(n/2)));
        return n > 0 && (n == 1 || (n%2 == 0 && Power(n/2)));
    }

}
