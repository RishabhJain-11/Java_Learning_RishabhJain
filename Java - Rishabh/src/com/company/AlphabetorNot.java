package com.company;

import java.util.Scanner;

//Q 13 Java Program to Check Whether a Character is Alphabet or Not
public class AlphabetorNot {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
        char inp= 'a';
//        String inp = in.nextLine();
        if((inp >= 'a' && inp <= 'z')||(inp >= 'A' && inp <= 'Z')){
            System.out.println(inp+" is an alphabet.");
        }else{
            System.out.println(inp+" is not a alphabet.");
        }
    }
}
/*
public class Alphabet {

    public static void main(String[] args) {

        char c = 'A';

        String output = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')
                ? c + " is an alphabet."
                : c + " is not an alphabet.";

        System.out.println(output);
    }
}
 */
/*
class Main {
  public static void main(String[] args) {

    // declare a variable
    char c = 'a';

    // checks if c is an alphabet
    if (Character.isAlphabetic(c)) {
      System.out.println(c + " is an alphabet.");
    }
    else {
      System.out.println(c + " is not an alphabet.");
    }
  }
}
 */
