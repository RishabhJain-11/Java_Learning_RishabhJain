package com.company;

import java.util.Scanner;

//Q8 Java Program to Check Whether an Alphabet is Vowel or Consonant
public class VovelorConstant {
    public static void main(String[] args) {

//        Scanner in =new Scanner(System.in);
//        String ch = in.next();
        char ch = 'i';

        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println("It is a vowel ");
        }else{
            System.out.println("It is a consonant ");
        }
    }
}
/*
you can use switch case statements also

public class VowelConsonant {

    public static void main(String[] args) {

        char ch = 'z';

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
    }
}
 */
