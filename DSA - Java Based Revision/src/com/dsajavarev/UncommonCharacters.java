package com.dsajavarev;

import java.util.Arrays;
import java.util.HashSet;

public class UncommonCharacters {
    public static void main(String[] args) {
        String A = "geeksforgeeks";
        String B = "geeksquiz";
        System.out.println(UncommonChars(A,B));
    }
    public static String UncommonChars(String A, String B)
    {
        // code here
        HashSet<Character> h = new HashSet<>();
        HashSet<Character> l = new HashSet<>();
        HashSet<Character> k = new HashSet<>();

        for(int i = 0;i < A.length();i++){
            h.add(A.charAt(i));
        }
        for(int i = 0;i < B.length();i++){
            l.add(B.charAt(i));
        }
        HashSet<Character> temp = new HashSet<>(h);
        h.removeAll(l);
        l.removeAll(temp);

        k.addAll(l);
        k.addAll(h);

        if(k.size()==0)
            return "-1";

        Object[] arr = k.toArray();
        Arrays.sort(arr);
        StringBuilder s = new StringBuilder();

        for(int i = 0;i < k.size();i++){
            s.append(arr[i]);
        }
        return s.toString();
    }
}
