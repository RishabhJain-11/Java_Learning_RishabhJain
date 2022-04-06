package com.dsajavarev;

import java.util.HashSet;

public class StringIsIsogramOrNot {
    public static void main(String[] args) {
        String S = "Rishabh";
        System.out.println(isIsogram(S));
    }
    static boolean isIsogram(String data){

        HashSet<Character> hs= new HashSet<>();

        for(int i=0;i<data.length();i++)
        {
            if(!hs.contains(data.charAt(i)))
            {
                hs.add(data.charAt(i));
            }

            else if(hs.contains(data.charAt(i)))
            {
                return false;
            }

        }
        return true;
    }
}
