package com.dsajavarev;

public class RemoveAllDuplicateInString {
    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(removeDuplicates(s));
    }
    public static String removeDuplicates(String S){
        // we made a resultant string builder for returning the final answer
        StringBuilder s = new StringBuilder();

        // traversing through the array
        for(char c:S.toCharArray()){
            // end size determined
            int size = s.length();


            if(size > 0 && s.charAt(size - 1) == c){
                s.deleteCharAt(size - 1);
            }else{
                s.append(c);
            }
        }
        return s.toString();
    }
}
