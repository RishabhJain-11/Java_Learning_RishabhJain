package com.sololearnjava;

import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int age = in.nextInt();

        if (age<=0) System.out.println("Error");
        else if(age <= 16){
            System.out.println("Too Young ");
        }else if(age <= 100){
            System.out.println("You are Welcome !");
        }else{
            System.out.println("Really!!!");
        }
    }
}
