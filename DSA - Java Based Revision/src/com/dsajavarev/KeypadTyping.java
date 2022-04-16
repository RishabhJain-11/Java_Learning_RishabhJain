package com.dsajavarev;

import java.util.HashMap;
import java.util.Map;

public class KeypadTyping {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        int n = 13;
        System.out.println(printNumber(s,n));
    }
    public static String printNumber(String s, int n)
    {
        Map<String,String> hm = new HashMap<String,String>();
        hm.put("2","abc");
        hm.put("3","def");
        hm.put("4","ghi");
        hm.put("5","jkl");
        hm.put("6","mno");
        hm.put("7","pqrs");
        hm.put("8","tuv");
        hm.put("9","wxyz");
        int i=0;
        StringBuilder res = new StringBuilder(new String(""));
        while(i<n){
            for(Map.Entry<String,String>entry:hm.entrySet()){
                if(entry.getValue().indexOf(s.charAt(i))!=-1){
                    res.append(entry.getKey());
                    i++;
                    break;
                }
            }
        }
        return res.toString();
        // time : O(n*8)= O(n)
        // space :O(8)=   O(1)
    }
}
