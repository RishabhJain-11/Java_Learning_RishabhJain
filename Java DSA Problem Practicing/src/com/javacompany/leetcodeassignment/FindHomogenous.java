package com.javacompany.leetcodeassignment;

public class FindHomogenous {
    public static void main(String[] args) {
        String s = "abbcccaa";
        System.out.println(countHomogenous(s));
    }

    static int countHomogenous(String s){
        int cur = 0, res = 0,count = 0,mod = 1_000_000_007;

        for (int i = 0; i < s.length(); ++i) {
            count = s.charAt(i) == cur ? count + 1 : 1;
            cur = s.charAt(i);
            res = (res + count) % mod ;
        }
        return res;
    }
}
