package com.javacompany.leetcodeassignment;

public class DecryptStringToIntegerMapping {
    public static void main(String[] args) {
        String s = "10#11#12";
        System.out.println(decrypt(s));
    }
    static String decrypt(String s){
        int n = s.length();
        String ans = "";
        for(int i = 0; i < n; ) {
            if(i < n - 2 && s.charAt(i + 2) == '#') {
                int num = Integer.parseInt(s.substring(i, i + 2));
                ans += (char)(num + 96);
                i = i + 3;
                continue;
            }
            ans += (char)(97 + s.charAt(i) - '1');
            i++;
        }
        return ans;
    }
}
