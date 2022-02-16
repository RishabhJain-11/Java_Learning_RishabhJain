package com.javacompany.leetcodeassignment;

public class CountConsistentStrings {
    public static void main(String[] args) {
        String allow = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};

        System.out.println(countConsistentStrings(allow,words));
    }

    //Brute Force Method
    static int countConsistentStrings(String allowed,String[] words){
        boolean[] map = new boolean[26];
        int res = 0;

        for(char c : allowed.toCharArray())
            map[c - 'a'] = true;

        search:
        for (String word : words){
            for (char c : word.toCharArray())

                if (!map[c - 'a'])
                    continue search;
                res++;
        }
        return res;
    }
}
//40 Projects