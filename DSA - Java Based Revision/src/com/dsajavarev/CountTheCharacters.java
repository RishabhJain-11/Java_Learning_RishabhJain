package com.dsajavarev;

public class CountTheCharacters {
    public static void main(String[] args) {
        String S = "abc";
        int N = 1;
        System.out.println(getCount(S,N));
    }
    static int getCount (String s, int N)
    {
        // your code here
        int[] arr = new int[26];
        char prev = '#';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (prev != c) {
                arr[c - 'a']++;
            }
            prev = c;
        }

        int count = 0;
        for (int j : arr) {
            if (j == N) {
                count++;
            }
        }
        return count;
    }
}
