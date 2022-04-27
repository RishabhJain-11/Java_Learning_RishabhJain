package com.dsajavarev;

import java.util.HashMap;

public class TwiceCounter {
    public static void main(String[] args) {
        String[] list = {"Geeks", "For", "Geeks"};
        int n = 3;
        System.out.println(countWords(list,n));
    }
    public static int countWords(String[] list, int n)
    {
        // code here
        HashMap<String,Integer> hash = new HashMap<>();
        for (String value : list) {
            int oldCount = hash.getOrDefault(value, 0);
            hash.put(value, oldCount + 1);
        }
        int count = 0;
        for(String s : hash.keySet()){
            if(hash.get(s)==2){
                count++;
            }
        }
        return count;
    }
}
