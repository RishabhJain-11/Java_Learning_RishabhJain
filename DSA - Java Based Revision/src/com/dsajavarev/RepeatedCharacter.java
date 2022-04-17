package com.dsajavarev;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RepeatedCharacter {
    public static void main(String[] args) {
        String S = "geeksforgeeks";
        System.out.println(firstRep(S));
    }
    static char firstRep(String S)
    {
        HashMap<Character, Integer> map = new LinkedHashMap<>();
        for(Character c: S.toCharArray())
            map.put(c, map.getOrDefault(c, 0)+1);
        for(Map.Entry<Character, Integer> e: map.entrySet()){
            if((int)e.getValue()>1)
                return (char)e.getKey();
        }
        return '#';
    }
}
