package com.dsajavarev;

public class AnagramPalindrome {
    public static void main(String[] args) {
        String s = "geeksogeeks";
        System.out.println(isPossible(s));
    }
    public static int isPossible (String s)
    {
        // your code here
        int n = s.length();
        int []arr = new int[256];
        for(int i =0;i<n;i++)
        {
            arr[s.charAt(i)]++;
        }
        int count =0;
        for (int j : arr) {
            if (j % 2 != 0) {
                count++;
            }
            if (count > 1) {
                return 0;
            }
        }
        return 1;
    }
}
