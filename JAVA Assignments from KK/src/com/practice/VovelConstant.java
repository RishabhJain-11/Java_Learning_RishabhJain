package com.practice;

import java.util.Scanner;

public class VovelConstant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String ch = in.next();

        switch (ch) {
            case "a", "e", "i", "o", "u" -> System.out.println(ch + " is a vowel");
            default -> System.out.println(ch + " is a consonant");
        }

    }
}
