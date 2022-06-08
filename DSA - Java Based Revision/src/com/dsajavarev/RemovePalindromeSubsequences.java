package com.dsajavarev;

public class RemovePalindromeSubsequences {
    public static void main(String[] args) {
        String s = "aabba";
        System.out.println(removePalindromeSub(s));
    }
    public static int removePalindromeSub(String S) {
        if (S.length() == 0) return 0;
        for (int i = 0, j = S.length() - 1; i < j; i++, j--)
            if (S.charAt(i) != S.charAt(j)) return 2;
        return 1;
    }
}
