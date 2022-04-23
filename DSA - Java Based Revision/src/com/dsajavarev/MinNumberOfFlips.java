package com.dsajavarev;

public class MinNumberOfFlips {
    public static void main(String[] args) {
        String s = "001";
        System.out.println(minFlips(s));
    }
    public static int minFlips(String S) {
        int fir = 0,sec = 0;
        for(int i = 0;i < S.length();i++){
            if((i%2==0 && S.charAt(i)=='1')||(i%2!=0 && S.charAt(i)=='0'))fir++;
            else sec++;
        }
        return Math.min(fir,sec);
    }
}
