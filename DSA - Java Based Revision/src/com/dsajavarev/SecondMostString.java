package com.dsajavarev;
//https://practice.geeksforgeeks.org/problems/second-most-repeated-string-in-a-sequence0534/1/?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&status[]=unsolved&category[]=Strings&sortBy=submissions#
import java.util.HashMap;

public class SecondMostString {
    public static void main(String[] args) {
        int N = 6;
        String[] arr = {"aaa", "bbb", "ccc", "bbb", "aaa", "aaa"};
        System.out.println(secFrequent(arr,N));
    }
    static String secFrequent(String[] arr, int N)
    {
        // your code here
        HashMap<String,Integer> map = new HashMap<>();

        for (String s : arr) {
            if (map.containsKey(s)) {
                int of = map.get(s);
                map.put(s, of + 1);
            } else {
                map.put(s, 1);
            }
        }
        int max = 0;
        for(String a : map.keySet()){
            if(map.get(a) > max)
                max = map.get(a);
        }
        int sec = 0;
        String str = "";
        for(String a : map.keySet()){
            if(map.get(a) < max && map.get(a) > sec){
                sec = map.get(a);
                str = a;
            }
        }
        return str;
    }
}
