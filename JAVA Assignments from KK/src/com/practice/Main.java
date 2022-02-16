package com.practice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//even or odd
        Scanner st = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int Num = st.nextInt();

        if(Num%2==0){
            System.out.println("The number "+Num+" is even");
        }
        else{
            System.out.println("The number is odd");
        }
    }
}
