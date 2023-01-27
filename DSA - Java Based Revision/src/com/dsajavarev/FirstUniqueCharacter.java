package com.dsajavarev;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqueCharacter(s));
    }
    /*
    public static int firstUniqueCharacter(String s){
        int res = Integer.MAX_VALUE;
        for(char c = 'a';c <= 'z';c++){
            int index = s.indexOf(c);

            if(index != -1 && index == s.lastIndexOf(c)){
                res = Math.min(res, index);
            }
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }
     */
    public static int firstUniqueCharacter(String s){
        int[] arr = new int[26];
        int n = s.length();

        // insert the string elements into the new array.
        for(int i = 0;i < n;i++){
            arr[s.charAt(i) - 'a']++;
        }

        // then check for the no. of times an element has occured.
        for(int i = 0;i < n;i++){
            // if it is occured just once then return the index;
            if(arr[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        // else return -1.
        return -1;
    }
}
