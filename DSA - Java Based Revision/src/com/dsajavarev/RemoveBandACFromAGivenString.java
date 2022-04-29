package com.dsajavarev;

public class RemoveBandACFromAGivenString {
    public static void main(String[] args) {
        String str = "aacbacc";
        System.out.println(stringFilter(str));
    }
    public static String stringFilter(String str)
    {
        StringBuilder ans = new StringBuilder();
        int i = 0;
        while(i < str.length()){
            if(i < str.length() - 1 && str.charAt(i) == 'a' && str.charAt(i+1) == 'c'){
                i = i+2;
            }else if (str.charAt(i) == 'b'){
                i++;
            }else{
                ans.append(str.charAt(i));
                i++;
            }
        }
        return ans.toString();
    }
}
