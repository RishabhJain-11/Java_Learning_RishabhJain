package com.javacompany.leetcodeassignment;

public class ImplementString {
    public static void main(String[] args) {
        String h = "hlllo";
        String n = "lll";//ok we have to return the index of the String to which the needle is pointing
        System.out.println(strStr(h,n));
    }
    static int strStr(String haystack,String needle){
        for (int i = 0;; i++) {
            for (int j = 0;; j++) {
                if (j==needle.length()) return i;
                if (i+j == haystack.length()) return -1;
                if (needle.charAt(j) != haystack.charAt(i+j))
                    break;
            }
        }
    }
}




