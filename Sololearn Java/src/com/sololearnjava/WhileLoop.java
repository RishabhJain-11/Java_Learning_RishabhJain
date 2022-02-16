package com.sololearnjava;

public class WhileLoop {
    /*
    A loop statement allows to repeatedly execute a statement or group of statements.
    A while loop statement repeatedly executes a target statement as long as a given condition is true.
     */
    public static void main(String[] args) {


        int num = 10;

        while(num>0){
            System.out.println("The number are as follows:"+num);
            num--;
        }
        /*
        The while loops check for the condition x > 0. If it evaluates to true, it executes the statements within its body. Then it checks for the statement again and repeats.
        Notice the statement x--. This decrements x each time the loop runs, and makes the loop stop when x reaches 0.
        Without the statement, the loop would run forever.
         */
    }
}
