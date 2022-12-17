package com.dsajavarev;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] arr = {"coding" ,"codezen","codingninja", "coder"};
        int n = 4;
        System.out.println(longestCommonPrefix(arr, n));
    }
    public static String longestCommonPrefix(String[] arr, int n){
        String prefix = "";
        int minLength = Integer.MAX_VALUE;

        for(int i = 0;i < n;++i){
            if(arr[i].length() < minLength){
                minLength = arr[i].length();
                prefix = arr[i];
            }
        }
        int start = 0;
        int end = minLength;
        int mid;

        while(start <= end){
            mid = (start + end)/2;
            if(isCommon(arr, prefix, mid, n)){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        mid = (start + end)/2;
        return prefix.substring(0, mid);
    }

    public static boolean isCommon(String[] arr, String prefix, int length, int n){
        for (int idx = 0; idx < length; ++idx) {
            for (int index = 0; index < n; index++) {
                if (arr[index].charAt(idx) != prefix.charAt(idx)) {
                    return false;
                }
            }
        }
        return true;
    }
}
