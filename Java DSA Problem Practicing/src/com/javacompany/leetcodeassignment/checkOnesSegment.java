package com.javacompany.leetcodeassignment;

public class checkOnesSegment {
    public static void main(String[] args) {
        String s = "11100";
        System.out.println(checkOnesSegement(s));
    }
    static boolean checkOnesSegement(String s){
//        return !s.contains("01");

        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i-1)=='0' && s.charAt(i) == '1')
                return false;
        }
        return true;
    }
}
