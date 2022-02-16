package com.sololearnjava;

import java.util.Scanner;

public class DecisionMaking {
    /*public static void main(String[] args) {
        int num = 20;
        if (num>25){
            System.out.println("You are in");
        }
        else if(num<25){
            System.out.println("You are immature .");
        }

        if(num<40){
            System.out.println("Hi Rishabh");
            /*
            Remember that you need to use two equal signs (==) to test for equality, since a single equal sign is the assignment operator.

        }*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age :");
        int age = in.nextInt();
//        System.out.print("Enter your age :"+age);
        if(age>0){
            if(age >16){
                System.out.println("You are good too go for juniors batch");
            }
            else{
                System.out.println("You are quite mature ,you should be in senior team.");
            }
        }else {
            System.out.println("Error");
        }
    }
    }

    /*
    Any of the following comparison operators may be used to form the condition:
    < less than
    > greater than
    != not equal to
    == equal to
    <= less than or equal to
    >= greater than or equal to
     */

