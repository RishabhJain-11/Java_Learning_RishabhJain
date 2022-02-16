package com.javacompany.leetcodeassignment;

public class LastSubString {
    public static void main(String[] args) {
            String s = "leetcode";
            String s1 = "abab";
        System.out.println(lastSubString(s));
        System.out.println(lastSubString(s1));
    }

    static String lastSubString(String s){
        int i =0,j=1,offset = 0,len = s.length();
        while(i+offset<len && j+offset<len){
            char c = s.charAt((i+offset)),d= s.charAt(j+offset);

            if(c==d){
                ++offset;
            }else{
                if(c<d){
                    i+= offset +1;
                }else{
                    j+=offset +1;
                }

                if(i==j){
                    ++j;
                }
                offset = 0;
            }
        }
        return s.substring(i);
    }
}
