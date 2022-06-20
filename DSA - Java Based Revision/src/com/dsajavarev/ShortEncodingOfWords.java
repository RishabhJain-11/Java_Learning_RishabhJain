package com.dsajavarev;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ShortEncodingOfWords {
    public static void main(String[] args) {
        String[] words = {"time", "me", "bell"};
        System.out.println(minimumLengthEncoding(words));
    }
    public static int minimumLengthEncoding(String[] words) {
        Set<String> s = new HashSet<>(Arrays.asList(words));
        for(String w : words)
            for(int i = 1;i < w.length();++i)
                s.remove(w.substring(i));
        int res = 0;
        for(String w : s) res += w.length() + 1;
        return res;
    }
}
