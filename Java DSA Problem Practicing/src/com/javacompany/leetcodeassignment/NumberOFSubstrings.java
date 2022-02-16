package com.javacompany.leetcodeassignment;

public class NumberOFSubstrings {
    public static void main(String[] args) {
        String [] patt = {"a","abc","bc","c"};
        String word = "abc";
        System.out.println(numofStrings(patt,word));
    }
    static int numofStrings(String[] patterns, String word){
        int res = 0;
        for(String p: patterns){
            if(word.contains(p)){
                res ++;
            }
        }
        return res;
    }
}
//patterns = ["a","abc","bc","d"], word = "abc"