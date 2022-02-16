package com.sololearnjava;

import java.util.Scanner;

public class SwitchStatement {
    /*
    A switch statement tests a variable for equality against a list of values. Each value is called a case, and the variable being switched on is checked for each case.
    When the variable being switched on is equal to a case, the statements following that case will execute until a break statement is reached.
    - When a break statement is reached, the switch terminates, and the flow of control jumps to the next line after the switch statement.
    - Not every case needs to contain a break. If no break appears, the flow of control will fall through to subsequent cases until a break is reached.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the day number :");
        int num = in.nextInt();

        switch (num) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Enter a right day number .");
        }
        /*
        A switch statement can have an optional default case.
        The default case can be used for performing a task when none of the cases is matched.
        No break is needed in the default case, as it is always the last statement in the switch.
         */

    }
}
