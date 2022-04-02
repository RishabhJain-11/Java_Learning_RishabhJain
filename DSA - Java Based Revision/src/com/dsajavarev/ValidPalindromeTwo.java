package com.dsajavarev;
//https://leetcode.com/problems/valid-palindrome-ii/
public class ValidPalindromeTwo {
    public static void main(String[] args) {
        String s = "aba";
        System.out.println(validPalindrome(s));
    }
    public static boolean validPalindrome(String s) {
//         int l = -1,r = s.length();
//         while (++l < r--)
//         if (s.charAt(l) != s.charAt(r))
//             return isPalindromic(s,l,r+1) || isPalindromic(s,l-1,r);
//         return true;
//     }

//     private static boolean isPalindromic(String s, int l, int r) {
//         while (++l < --r)
//             if (s.charAt(l) != s.charAt(r))
//                 return false;
//             return true;
        int l = 0;
        int r = s.length()-1;
        while (l<=r){
            if (s.charAt(l) == s.charAt(r)){
                l++;
                r--;
            }
            else{
                return isPalindrome(s,l,r-1) || isPalindrome(s,l+1,r);
            }
        }
        return true;
    }

    private static boolean isPalindrome(String str, int s, int t){
        while (s <= t){
            if (str.charAt(s) == str.charAt(t)){
                s++;
                t--;
            }
            else
                return false;
        }

        return true;
    }
}
