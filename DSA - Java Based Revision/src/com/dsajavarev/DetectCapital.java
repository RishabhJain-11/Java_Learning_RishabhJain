package com.dsajavarev;

public class DetectCapital {
    public static void main(String[] args) {
        String word = "USA";
        System.out.println(detectCapitalUse(word));
    }

    public static boolean detectCapitalUse(String word){
        int n = word.length();
        if(n == 1){
            return true;
        }
        if(Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))){
            for (int i = 2;i < n;i++){
                if(Character.isLowerCase(word.charAt(i))){
                    return false;
                }
            }
        }else{
            for(int i = 1;i < n;i++){
                if(Character.isUpperCase(word.charAt(i))){
                    return false;
                }
            }
        }
        return true;
    }
}
