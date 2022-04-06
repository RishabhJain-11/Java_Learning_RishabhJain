package com.dsajavarev;

public class FirstLetterOfEverySentec {
    public static void main(String[] args) {
       String S = "geeks for geeks";
        System.out.println(firstAlphabet(S));
    }
    public static String firstAlphabet(String S) {
        String[] ab = S.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String str: ab){
            sb.append(str.charAt(0));

        }
        return sb.toString();
    }
}
