package com.dsajavarev;

import java.util.Arrays;

public class OrderlyQueue {
    public static void main(String[] args) {
        String s = "cba";
        int k = 1;
        System.out.println(orderlyQueue(s,k));
    }
    public static String orderlyQueue(String s, int k) {
        if(k == 1){
            String ans = s;
            for(int i = 0;i < s.length();++i){
                String temp = s.substring(i) + s.substring(0, i);

                if(temp.compareTo(ans) < 0){
                    ans = temp;
                }
            }
            return ans;
        }else{
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            return new String(chars);
        }
    }
}
