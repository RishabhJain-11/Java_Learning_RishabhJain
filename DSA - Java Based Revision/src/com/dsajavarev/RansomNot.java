package com.dsajavarev;

import java.util.HashMap;

public class RansomNot {
    public static void main(String[] args) {
        String note = "aa";
        String mag = "aab";
        System.out.println(canConstruct(note, mag));
    }
    public static boolean canConstruct(String note, String mag){
        HashMap<Character, Integer> magLetters = new HashMap<>();

        for(int i = 0;i < mag.length();i++){
            char m = mag.charAt(i);
            int count = magLetters.getOrDefault(m, 0);
            magLetters.put(m, count+1);
        }
        for(int i = 0;i < note.length();i++){
            char r = note.charAt(i);
            int count = magLetters.getOrDefault(r, 0);
            if(count == 0){
                return false;
            }
            magLetters.put(r, count-1);
        }
        return true;
    }
}
