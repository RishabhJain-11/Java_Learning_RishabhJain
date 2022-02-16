package com.sololearnjava;

import java.util.Scanner;

public class Input_Output {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("My name is "+name);
        /*
        You can now read in different kinds of input data that the user enters.
Here are some methods that are available through the Scanner class:
Read a byte - nextByte()
Read a short - nextShort()
Read an int - nextInt()
Read a long - nextLong()
Read a float - nextFloat()
Read a double - nextDouble()
Read a boolean - nextBoolean()
Read a complete line - nextLine()
Read a word - next()
         */
    }
}
