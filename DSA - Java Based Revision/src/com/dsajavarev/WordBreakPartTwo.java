package com.dsajavarev;

import java.util.ArrayList;
import java.util.List;

public class WordBreakPartTwo {
    public static void main(String[] args) {
        String s = "catsanddog";
        int n = 5;
//        List<String> dict = {"cats", "cat", "and", "sand", "dog"};
//        System.out.println(wordBreak());
    }

    static List<String> wordBreak(int n, List<String> dict, String s)
    {
        // code here
        List<String> ans = new ArrayList<>();
        String res = "";
        solve(s,dict,res,ans);
        return ans;
    }
    static void solve(String s,List<String> dict,String res,List<String> ans){
        if(s.length() == 0){
            res = res.trim();
            ans.add(res);
            return ;
        }
        for(int i = 0;i < s.length();i++){
            if(dict.contains(s.substring(0,i+1))){
                solve(s.substring(i+1),dict,res+s.substring(0,i+1)+" ",ans);
            }
        }
    }
}
