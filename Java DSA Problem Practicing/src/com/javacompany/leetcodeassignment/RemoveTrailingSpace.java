package com.javacompany.leetcodeassignment;

import java.util.ArrayList;
import java.util.List;

public class RemoveTrailingSpace {
    public static void main(String[] args) {
        String s = "HOW ARE YOU";
        System.out.println(printVertically(s));
    }
    static List<String> printVertically(String s){
        String[] words = s.split(" ");
        int mx = 0;

        for (int i = 0; i < words.length; i++)
            mx = Math.max(mx,words[i].length());

        List<String> ans = new ArrayList<>();

        for (int i = 0; i < mx; i++) {
                StringBuilder sb = new StringBuilder();

            for (String word: words)
                sb.append(i<word.length() ? word.charAt(i) : " ");

/*
            while (sb.charAt(sb.length() - 1) == ' ')
                sb.deleteCharAt(sb.length()-1);
            ans.add(sb.toString());
*/
            ans.add(sb.toString().stripTrailing());
        }
        return ans;
    }
}
//ans.add(sb.toString().stripTrailing());
