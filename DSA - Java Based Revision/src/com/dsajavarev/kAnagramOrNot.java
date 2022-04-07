package com.dsajavarev;

import java.util.HashMap;

public class kAnagramOrNot {
    public static void main(String[] args) {
        String s1 = "fodr";
        String s2 = "gork";
        int k = 2;
        System.out.println(areKAnagrams(s1,s2,k));
    }
    static boolean areKAnagrams(String s1, String s2, int k){
        if (s1.length() != s2.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < s1.length(); i++)
            map.put(s1.charAt(i), map.containsKey(s1.charAt(i)) ? map.get(s1.charAt(i)) + 1 : 1);

        for (int i = 0; i < s2.length(); i++) {
            if (!map.containsKey(s2.charAt(i)))
                count++;
            else {
                map.put(s2.charAt(i), map.get(s2.charAt(i)) - 1);
                if (map.get(s2.charAt(i)) == 0)
                    map.remove(s2.charAt(i));
            }
        }
        return count <= k;
    }
}
