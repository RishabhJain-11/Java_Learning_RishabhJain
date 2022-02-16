package com.javacompany.leetcodeassignment;

public class MaximumRepeatingString {
    public static void main(String[] args) {
        String seq = "abdbc";
        String wrd = "ab";
        System.out.println(maxRepeating(seq,wrd));
    }
    static int maxRepeating(String sequence,String word){
        int ans = 1;
        while(sequence.contains(word.repeat(ans)))
            ans++;

        return ans - 1;
    }
}
