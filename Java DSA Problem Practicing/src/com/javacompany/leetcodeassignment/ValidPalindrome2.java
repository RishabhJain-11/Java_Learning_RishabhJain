package com.javacompany.leetcodeassignment;

public class ValidPalindrome2 {
    public static void main(String[] args) {
        String sf = "aba";
        System.out.println(validPalinDrome2(sf));
    }
    static boolean validPalinDrome2(String s){
        int l = -1,r = s.length();
        while (++l < r--)
        if (s.charAt(l) != s.charAt(r))
            return isPalindromic(s,l,r+1) || isPalindromic(s,l-1,r);
        return true;
    }

    private static boolean isPalindromic(String s, int l, int r) {
        while (++l < --r)
            if (s.charAt(l) != s.charAt(r))
                return false;
            return true;
    }
}
