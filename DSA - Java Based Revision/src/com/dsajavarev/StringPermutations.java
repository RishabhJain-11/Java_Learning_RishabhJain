package com.dsajavarev;

import java.util.ArrayList;
import java.util.Collections;

public class StringPermutations {
    public static void main(String[] args) {
        String s = "ABC";
        System.out.println(permutation(s));
    }
    public static ArrayList<String> permutation(String s)
    {
        //Your code here
        ArrayList<String> ans = new ArrayList<>();
        permutation(s,"",ans);
        Collections.sort(ans);
        return ans;
    }
    static void permutation(String str,String ans,ArrayList<String>res){
        if(str.length() == 0){
            res.add(ans);
            return;
        }
        for(int i = 0;i < str.length();i++){
            char ch = str.charAt(i);
            String left = str.substring(0,i);
            String right = str.substring(i+1);
            String ros = left + right;
            permutation(ros,ans+ch,res);
        }
    }
}
