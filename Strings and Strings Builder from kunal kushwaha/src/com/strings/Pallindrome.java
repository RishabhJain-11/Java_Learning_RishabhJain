package com.strings;

import java.util.Locale;

public class Pallindrome {
    public static void main(String[] args) {
        String str= null;
        System.out.println(isPalindrome(str));
//        int start=0,end=n-1;

    }
    static boolean isPalindrome(String str){
        if(str == null || str.length()==0){
            return true;
        }
        str = str.toLowerCase(Locale.ROOT);
        for (int i = 0; i < str.length()/2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() -i-1);

            if(start != end){
                return false;
            }

        }
        return  true;
    }
}
