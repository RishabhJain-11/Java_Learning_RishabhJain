package com.dsajavarev;

//import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
//    public static void main(String[] args) {
//        String s = "anagram", t = "nagaram";
//        System.out.println(valid(s,t));
//    }
//    public static boolean valid(String s,String t){
//        /*
//        if(s == null || t == null)
//            return s == t;
//
//        char[] sChar = s.toCharArray();
//        char[] tChar = t.toCharArray();
//
//        Arrays.sort(sChar);
//        Arrays.sort(tChar);
//        return Arrays.equals(sChar,tChar);
//         */
//
//        if(s.length() != t.length()){
//            return false;
//        }
//
//        Map<Character, Integer> maps = new HashMap<>();
//        for(char c : s.toCharArray()){
//            maps.put(c, maps.getOrDefault(c, 0) + 1);
//        }
//        Map<Character, Integer> mapt = new HashMap<>();
//        for(char c : t.toCharArray()){
//            mapt.put(c, mapt.getOrDefault(c, 0) + 1);
//        }
//
//        return maps.equals(mapt);
//     }

    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s,t));
    }
    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> maps = new HashMap<>();
        for(char c : s.toCharArray()){
            maps.put(c, maps.getOrDefault(c, 0) + 1);
        }
        Map<Character, Integer> mapt = new HashMap<>();
        for(char c : t.toCharArray()){
            mapt.put(c, mapt.getOrDefault(c, 0) + 1);
        }

        return maps.equals(mapt);
    }
}
