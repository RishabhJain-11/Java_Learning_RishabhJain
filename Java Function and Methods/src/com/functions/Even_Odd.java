package com.functions;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();


        /*
        can also use the brute force method for this example at first :
        if(num%2==0){
        print---even
        }else{
        print-- odd
        }
         */


        /*
        checkout gfg for other ways to do it !!
         */
        //bitwise operator
        if((num|1)>num){
            System.out.println(num+" is even");
        }
        else{
            System.out.println(num+" is odd.");
        }
    }
}
