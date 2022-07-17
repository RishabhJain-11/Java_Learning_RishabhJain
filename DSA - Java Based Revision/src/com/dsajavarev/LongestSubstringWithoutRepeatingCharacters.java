package com.dsajavarev;

//import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s){
        /*
        if(s.length() == 0)
            return 0;

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;

        for (int i = 0,j = 0;i < s.length();i++){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i - j + 1);
        }
        return max;
         */

        int start = 0;
        int end = 0;
        int max = 0;

        HashSet<Character> hs = new HashSet<>();
        while (end < s.length()){
            if(!hs.contains(s.charAt(end))){
                hs.add(s.charAt(end));
                end++;
                max = Math.max(hs.size(),max);
            }else {
                hs.remove(s.charAt(start));
                start++;
            }
        }
        return max;
    }
}

// Hash set is used so that no repeating elements are there
