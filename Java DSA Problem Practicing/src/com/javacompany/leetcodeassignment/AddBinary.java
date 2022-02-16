package com.javacompany.leetcodeassignment;

import java.util.Scanner;

public class AddBinary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Add first number = ");
        String a = in.next();
        System.out.print("Add second number = ");
        String b = in.next();
        System.out.print("The binary addition is ");
        System.out.println(addBinary(a,b));
    }
    static String addBinary(String a,String b){
        StringBuilder sb = new StringBuilder();
        int i = a.length() -1 ;int j = b.length()-1 ,carry = 0;
        while (i >= 0 || j>=0){
            int sum = carry;
            if (j>=0) sum+= b.charAt(j--) - '0';
            if (i>=0) sum+= a.charAt(i--) - '0';
            sb.append(sum % 2);
            carry = sum  / 2;
        }
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }
}
