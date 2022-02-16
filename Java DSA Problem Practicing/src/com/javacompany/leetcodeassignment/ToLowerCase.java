package com.javacompany.leetcodeassignment;

public class ToLowerCase {
    public static void main(String[] args) {
        String s = "Rishabh Jain";
        System.out.println(toLower(s));
    }

    static String toLower(String s){
        char[] a = s.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if ('A' <= a[i] && a[i] <= 'Z')
                a[i] = (char)(a[i] - 'A' + 'a');
        }
        return new String(a);
    }
}
