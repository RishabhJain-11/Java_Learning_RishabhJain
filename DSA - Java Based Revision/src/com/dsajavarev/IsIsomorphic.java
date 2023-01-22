package com.dsajavarev;

import java.util.HashMap;
import java.util.HashSet;

public class IsIsomorphic {
    public static void main(String[] args) {

    }
    public static boolean isIsomorphic(String s, String t){
        HashMap<Character, Character> dict = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (dict.containsKey(sChar)) {
                if (dict.get(sChar) != tChar) {
                    return false;
                }
            } else {
                dict.put(sChar, tChar);
            }
        }

        // Check if map is injective
        HashSet<Character> set = new HashSet<>();
        for (char key : dict.keySet()) {
            if (set.contains(dict.get(key))) {
                return false;
            } else {
                set.add(dict.get(key));
            }
        }
        return true;
    }
}
