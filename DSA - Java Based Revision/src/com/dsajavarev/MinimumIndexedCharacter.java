package com.dsajavarev;

import java.util.ArrayList;
import java.util.Collections;

public class MinimumIndexedCharacter {
    public static void main(String[] args) {
        String S = "zsyle";
        String patt = "bjz";
        System.out.println(printMinIndexChar(S,patt));
    }
    public static String printMinIndexChar(String S, String patt){
        int a = patt.length();
        int flag = 0;
        ArrayList<Integer> l = new ArrayList<>();
        for(int i = 0;i < a;i++){
            char c = patt.charAt(i);
            if(S.contains(Character.toString(c))){
                l.add(S.indexOf(c));
                flag = 1;
            }
        }
        if(flag == 1){
            Collections.sort(l);
            char n = S.charAt(l.get(0));
            return Character.toString(n);
        }
        return "$";
    }
}
