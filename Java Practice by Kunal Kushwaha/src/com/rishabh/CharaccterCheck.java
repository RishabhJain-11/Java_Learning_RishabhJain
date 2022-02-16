package com.rishabh;

import java.util.Scanner;

public class CharaccterCheck {
    public static void main(String[] args) {
        // find the lowercase or uppercase charaters
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);

        if (ch >='a' && ch <= 'z'){
            System.out.println("Lowercase");
        }
        else{
            System.out.println("Uppercase");
        }
    }
}
