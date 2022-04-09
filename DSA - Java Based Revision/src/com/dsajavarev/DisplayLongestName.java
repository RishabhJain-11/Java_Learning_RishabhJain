package com.dsajavarev;

public class DisplayLongestName {
    public static void main(String[] args) {
        String[] names = {"Geek", "Geeks", "Geeksfor",
                "GeeksforGeek", "GeeksforGeeks"};
        int n = 5;
        System.out.println(longest(names,n));

    }
    static String longest(String[] names, int n) {
        String s = names[0];
        for(int j = 1; j <names.length; j++) {
            String l = names[j];
            if(s.length() < l.length()) s = l; }
        return s;
    }
}
