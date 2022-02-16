package com.sololearnjava;

import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a number.");

        int num = in.nextInt();

        int x=1;
        do{
            System.out.println(x);
            x++;
        }while(x<num);
        /*
        The break and continue statements change the loop's execution flow.
        The break statement terminates the loop and transfers execution to the statement immediately following the loop.
         */
        /*
        The continue statement causes the loop to skip the remainder of its body and then immediately retest its condition prior to reiterating. In other words, it makes the loop skip to its next iteration.
         */
    }
}
