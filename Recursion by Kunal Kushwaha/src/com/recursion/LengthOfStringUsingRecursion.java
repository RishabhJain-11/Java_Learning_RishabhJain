package com.recursion;

public class LengthOfStringUsingRecursion {
    public static void main(String[] args) {

        String str = "gbsf5665";
        System.out.println(len(str));
    }
    static int len(String str){
        if(str.equals("")){
            return 0;
        }//the base condition is some what true
        return len(str.substring(1))+1;
    }
}


//base case
//recursive call
//call the function