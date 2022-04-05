package com.dsajavarev;

import java.util.HashMap;

public class AnagramOfAString {
    public static void main(String[] args) {
        String S1 = "bcadeh";
        String S2 = "hea";
        System.out.println(remAnagrams(S1,S2));
    }
    public static int remAnagrams(String s,String s1)
    {
        HashMap<Character, Integer> map= new HashMap<>();
        for(int i=0; i<s.length();i++)
        {
            char ch= s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for(int i=0; i<s1.length();i++)
        {
            char ch= s1.charAt(i);

            if(!map.containsKey(ch))
                map.put(ch,-1);
            else
                map.put(ch, map.get(ch)-1);
        }
        int count =0;
        for(int i: map.values())
        {
            if(i<0)
                count= count-i;
            else
                count=count+i;
        }

        return count;
    }
}
