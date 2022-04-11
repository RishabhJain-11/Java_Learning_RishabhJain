package com.dsajavarev;

public class RemoveCommonCharacters {
    public static void main(String[] args) {
        String s1 = "aacdb";
        String s2 = "gafd";
        System.out.println(concatenatedString(s1,s2));

    }
    public static String concatenatedString(String s1,String s2)
    {
        // Your code here
        StringBuilder res = new StringBuilder();
        for(Character c : s1.toCharArray()){
            if(!s2.contains(c.toString())){
                res.append(c.toString());
            }
        }
        for(Character c : s2.toCharArray()){
            if(!s1.contains(c.toString())){
                res.append(c.toString());
            }
        }
        if(res.length() <= 0){
            return "-1";
        }
        else
            return res.toString();
    }
}
