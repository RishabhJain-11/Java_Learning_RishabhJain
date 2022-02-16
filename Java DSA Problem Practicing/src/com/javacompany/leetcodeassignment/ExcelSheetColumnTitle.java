package com.javacompany.leetcodeassignment;

public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        int n = 25;
        System.out.println(convertToTitle2(n));
    }
    static String convertToTitle(int n){
        return n==0 ? "" : convertToTitle(--n/26) + (char)('A' + (n % 26));
    }

    static String convertToTitle2(int n){
        StringBuilder res = new StringBuilder();

        while (n > 0){
            n--;
            res.insert(0,(char)('A' + n % 26));
            n /= 26;
        }
        return res.toString();
    }
}