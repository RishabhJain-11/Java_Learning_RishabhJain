package com.rishabh;

import java.net.SecureCacheResponse;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        // Take input from user till user doues not press x / X
        int ans =0;

        while(true){
            System.out.print("Enter the Operator :");
            char op = in.next().trim().charAt(0);

            if(op =='+' || op == '-'  || op == '*' || op == '/' || op == '%'){
                System.out.println("enter the two numbers :");
            int a = in.nextInt();
            int b = in.nextInt();

            if(op == '+'){
                ans = a + b;

            }
            if(op == '-'){
                ans = a-b;
            }
            if(op == '*'){
                ans = a*b;
            }
            if(op == '/'){
                if(b != 0){
                    ans = a/b;
                }
            }
            if(op == '%'){
                ans = a%b;
            }
            }
            else if (op == 'x' || op == 'X'){
                break;
            }
            else{
                System.out.println("Entered Invalid operation ");
            }
            System.out.println(ans);
        }
    }
}
