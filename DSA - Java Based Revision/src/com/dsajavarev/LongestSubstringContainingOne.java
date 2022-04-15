package com.dsajavarev;

public class LongestSubstringContainingOne {
    public static void main(String[] args) {
        String s = "01110221211111134296063509";
        System.out.println(count(s));
    }
    public static int count(String s)
    {
        //add code here.

        int max = 0,count = 0,len = s.length();
        for(int i = 0;i < len;i++){
            if(s.charAt(i) == '1'){
                count++;
                max = Math.max(count,max);
            }
            else
                count = 0;
        }
        return max;
    }
}
