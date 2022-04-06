package com.dsajavarev;

public class MaximumOccuringCharacter {
    public static void main(String[] args) {
        String str = "testsample";
        System.out.println(getMaxOccuringChar(str));
    }
    public static char getMaxOccuringChar(String str)
    {
        // Your code here
        int[] arr = new int[26];
        for(int i = 0;i < str.length();i++){
            arr[str.charAt(i) - 'a']++;
        }
        int maxi = 0;
        int ans = 0;
        for(int i = 0;i < arr.length;i++){
            if(maxi < arr[i]){
                maxi = arr[i];
                ans = i;
            }
        }
        return (char)(ans + 'a');
    }
}
