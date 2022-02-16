package com.sololearnjava;

public class ValueTypes {
    public static void main(String[] args) {
        int x = 6;
        addOneTo(x);
        System.out.println(x);
    }

    static void addOneTo(int num){
        num = num + 5;//The method from the example above takes the value of its parameter, which is why the original variable is not affected and 6 remains as its value.
    }
}
