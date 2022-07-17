package com.dsajavarev;

import java.util.List;

public class WordBreak {
    public static void main(String[] args) {
        String s = "leetcode";
        String[] wordDict = {"leet","code"};
        System.out.println(wordBreak(s, List.of(wordDict)));
    }
    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean[] f = new boolean[s.length() + 1];

        f[0] = true;

        for(int i = 1;i <= s.length();i++){
            for(int j = 0;j < i;j++){
                if(f[j] && wordDict.contains(s.substring(j,i))){
                    f[i] = true;
                    break;
                }
            }
        }
        return f[s.length()];
    }
}
