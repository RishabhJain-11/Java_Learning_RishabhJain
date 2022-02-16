package com.sololearnjava;

import java.util.stream.IntStream;

public class ForLoop {
    public static void main(String[] args) {
        /*
        for (initialization; condition; increment/decrement) {statement(s)}
        Initialization: Expression executes only once during the beginning of loop
        Condition: Is evaluated each time the loop iterates. The loop executes the statement repeatedly, until this condition returns false.
        Increment/Decrement: Executes after each iteration of the loop.
         */
//        for (int i = 0; i < 6; i++) {
//            System.out.println(i);
//        }
        //Notice the semicolon (;) after initialization and condition in the syntax.




        //enhanced for loop
        /*
        The enhanced for loop (sometimes called a "for each" loop) is used to traverse elements in arrays.
        The advantages are that it eliminates the possibility of bugs and makes the code easier to read.
         */

        int[] arr ={3,5,6,8,74,45,667,6};
        int sum =0;
        for (int j : arr) { //Notice the colon after the variable in the syntax
            sum += j;
        }
        System.out.println(sum);
    }
}
