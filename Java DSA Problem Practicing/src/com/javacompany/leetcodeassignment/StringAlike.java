package com.javacompany.leetcodeassignment;

public class StringAlike {
    public static void main(String[] args) {

    }



    static boolean stringAlike(String s){
        if(s.length() == 0)
            return false;

        int leftC = 0,rightC = 0;

        for (int i = 0; i < (s.length()/2); i++) {
            switch (s.charAt(i)) {
                case 'a' -> leftC++;
                case 'e' -> leftC++;
                case 'i' -> leftC++;
                case 'o' -> leftC++;
                case 'u' -> leftC++;
                case 'A' -> leftC++;
                case 'E' -> leftC++;
                case 'I' -> leftC++;
                case 'O' -> leftC++;
                case 'U' -> leftC++;
            }
        }


        for (int i = (s.length()/2); i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'a' -> rightC++;
                case 'e' -> rightC++;
                case 'i' -> rightC++;
                case 'o' -> rightC++;
                case 'u' -> rightC++;
                case 'A' -> rightC++;
                case 'E' -> rightC++;
                case 'I' -> rightC++;
                case 'O' -> rightC++;
                case 'U' -> rightC++;
            }
        }

        if (rightC == leftC)
            return true;
        else
            return false;
    }
}
