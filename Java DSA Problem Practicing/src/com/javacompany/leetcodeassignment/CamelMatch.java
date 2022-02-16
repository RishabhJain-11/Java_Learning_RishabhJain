package com.javacompany.leetcodeassignment;

import java.util.ArrayList;
import java.util.List;

public class CamelMatch {
    public static void main(String[] args) {
        String[] q = {"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"};
        String p = "FoBa";
    }

    static List<Boolean> camelMatch(String[] queries,String pattern){
        List<Boolean> res = new ArrayList<>();
        for (String query : queries)
            res.add(isMatch(query,pattern));
        return res;
    }

    private static Boolean isMatch(String query, String pattern) {
        int i = 0;
        for (char c : query.toCharArray()){
            if(i<pattern.length() && c == pattern.charAt(i))
                i++;
            else if (c<'a')
                return false;
        }
        return i==pattern.length();
    }
}
