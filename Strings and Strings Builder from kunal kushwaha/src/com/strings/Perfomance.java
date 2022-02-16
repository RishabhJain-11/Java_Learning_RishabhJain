package com.strings;

public class Perfomance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch =(char)('a'+i);
            System.out.println(ch);
            series = series+ch;//abcdefghijklmnopqrstuvwxyz
        }
        System.out.println(series);
    }
}
//String builder = in which the same is used for modification
