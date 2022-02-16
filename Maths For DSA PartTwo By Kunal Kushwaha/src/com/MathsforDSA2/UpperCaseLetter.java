package com.MathsforDSA2;

import com.sun.source.tree.BreakTree;

import java.io.CharArrayReader;

public class UpperCaseLetter {
    /*
    static char first (String str){
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i)))
                return str.charAt(i);
        }
        return 0;
     */
    static char first(String str, int i) {

        if(str.charAt(i) == '\0')
            return 0;
        if(Character.isUpperCase(str.charAt(i)))
            return str.charAt(i);
        return  first(str,i+1);
    }




    public static void main(String[] args) {
        String str ="";
        char res = first(str,0);
        if(res == 0)
            System.out.println("No Uppercase letter");
        else
            System.out.println(res);
    }
}
