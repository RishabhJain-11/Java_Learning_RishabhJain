package com.dsajavarev;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(valid(s,t));
    }
    public static boolean valid(String s,String t){
        if(s == null || t == null)
            return s == t;

        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);
        return Arrays.equals(sChar,tChar);
     }
}
