package com.javacompany.leetcodeassignment;

public class NumOfSub {
    public static void main(String[] args) {
        String s = "0110111";
        System.out.println(numSub(s));
    }
    static int numSub(String s){
        int res  = 0,count = 0,mod = (int)1e9+7;
        for (int i = 0; i < s.length(); i++) {
            count = s.charAt(i) == '1' ? count + 1 : 0;
            res = (res + count) % mod;
        }
        return res;
    }
}
