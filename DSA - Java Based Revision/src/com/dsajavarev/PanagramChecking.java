package com.dsajavarev;
//https://practice.geeksforgeeks.org/problems/pangram-checking-1587115620/1/?page=1&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&status[]=unsolved&category[]=Strings&sortBy=submissions
import java.util.HashSet;

public class PanagramChecking {
    public static void main(String[] args) {
        String str = "Bawds jog, flick quartz, vex nymph";
        System.out.println(checkPangram(str));
    }
    public static boolean checkPangram  (String str) {
        HashSet<Character> set = new HashSet<>();
        for(int i = 0;i < str.length();i++){
            char element = str.charAt(i);
            if((element >= 'A' && element <= 'Z') || (element >= 'a' && element <= 'z'))
                set.add(element);
        }
        return set.size() == 26;
    }
}
