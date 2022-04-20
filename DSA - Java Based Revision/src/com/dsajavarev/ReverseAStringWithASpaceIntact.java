package com.dsajavarev;

public class ReverseAStringWithASpaceIntact {
    public static void main(String[] args) {
        String s = "Help others";
        System.out.println(reverseWithSpacesIntact(s));
    }
    public static String reverseWithSpacesIntact(String S)
    {
        // your code here
        StringBuilder answer= new StringBuilder();
        int index = S.length()-1;
        for(int i =0;i<S.length();i++){
            if(S.charAt(i)!=' '){
                if(S.charAt(index)!=' '){
                    answer.append(S.charAt(index));
                }
                else{
                    while(S.charAt(index) ==' ')
                        index--;
                    answer.append(S.charAt(index));
                }
                index--;
            }
            else
                answer.append(" ");

        }
        return answer.toString();
    }
}
