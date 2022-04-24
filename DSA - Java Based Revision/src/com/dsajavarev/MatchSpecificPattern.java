package com.dsajavarev;

import java.util.ArrayList;
import java.util.HashMap;

public class MatchSpecificPattern {
    public static void main(String[] args) {
//        ArrayList [] dict = {abb,abc,xyz,xyy};
        String patter = "foo";
//        System.out.println(findMatchedWords(dict,patter));
    }
    public static ArrayList<String> findMatchedWords(ArrayList<String> dict, String pattern)
    {
        //add code here.
        String patt = findPattern(pattern , pattern.length());
        ArrayList<String> res = new ArrayList<>();

        for (String temp : dict) {
            if (temp.length() != pattern.length()) continue;
            if (patt.equals(findPattern(temp, temp.length())))
                res.add(temp);
        }
        return res;
    }
    static String findPattern(String s , int n){
        StringBuilder patt = new StringBuilder();
        int ind = 1;
        HashMap<Character , Integer> map = new HashMap<>();

        for(int i =  0; i < n; i++){
            if(map.containsKey(s.charAt(i))){
                String st = Integer.toString(map.get(s.charAt(i)));
                patt.append(st);
            }
            else{
                map.put(s.charAt(i) , ind);
                patt.append(Integer.toString(ind));
                ind++;
            }
        }
        return patt.toString();
    }
}
