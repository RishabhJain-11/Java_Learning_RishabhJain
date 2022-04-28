package com.dsajavarev;

import java.util.ArrayList;

public class ClosestString {
    public static void main(String[] args) {
//        String[] s = new String[]{"the", "quick", "brown", "fox", "quick"};
        String word1 = "the";
        String word2 = "fox";
//        System.out.println(shortestDistance(s,word1,word2));
    }
    static int shortestDistance(ArrayList<String> s, String word1, String word2) {
        // code here
        int w1 = -1;
        int w2 = -1;
        int mm = Integer.MAX_VALUE;

        for(int i = 0;i < s.size();i++){
            if(s.get(i).equals(word1))
                w1 = i;
            if(s.get(i).equals(word2))
                w2 = i;

            if(w1 != -1 && w2!=-1)
                mm = Math.min(mm,Math.abs(w2 - w1));
        }
        return mm;
    }
}
