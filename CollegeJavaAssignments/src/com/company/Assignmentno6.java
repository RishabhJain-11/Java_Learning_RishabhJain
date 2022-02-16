package com.company;

import java.util.Scanner;
public class Assignmentno6{
    public static void main(String[] args){
        int Num1,Num2;
        int result;
        Scanner in = new Scanner(System.in);
        try{
            System.out.println("Enter the first value : ");
            Num1 = Integer.parseInt(in.next());
            System.out.println("Enter the second value : ");
                    Num2 = Integer.parseInt(in.next());
            result = Num1/Num2;
            System.out.println("Result is : "+ result);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide a number by zero !");
        }
        catch(NumberFormatException e){
            System.out.println("Input is invalid \nPlease enter valid input");
        }
    }
}

