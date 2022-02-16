package com.javacompany.leetcodeassignment;

public class ReversePrefix {
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(reversePrefix(word,ch));
    }

    static String reversePrefix(String word , char ch){
        char[] c = word.toCharArray();
        int locate = 0;
        for (int i = 0; i < word.length(); i++) {
            if(ch == c[i]){
                locate = i;
                break;
            }
        }

        char [] res = new char[word.length()];
        for (int i = 0; i <= locate; i++) {
            res[i] = c[locate-i];
        }
        for (int i = locate + 1; i < word.length(); i++) {
            res[i] = c[i];
        }
        return String.valueOf(res);
    }
}
