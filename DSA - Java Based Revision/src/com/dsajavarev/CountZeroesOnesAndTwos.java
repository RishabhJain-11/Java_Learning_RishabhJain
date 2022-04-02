package com.dsajavarev;

public class CountZeroesOnesAndTwos {
    public static void main(String[] args) {
        String s = "021201";
        System.out.println(smallestSubstring(s));
    }
    public static int smallestSubstring(String S) {
        // Code here
        int n = S.length();
        int i = 0;
        int j = 0;
        int min = Integer.MAX_VALUE;
        int[] arr = new int[3];

        while(j < n){
            if(S.charAt(j) == '0')arr[0]++;
            else if(S.charAt(j) == '1') arr[1]++;
            else if(S.charAt(j) == '2') arr[2]++;

            while(i < j && arr[0] >= 1 && arr[1] >= 1 && arr[2] >= 1){
                min = Math.min(min,j-i+1);
                int x = S.charAt(i) - '0';
                arr[x]--;
                i++;
            }
            j++;
        }
        if(min == Integer.MAX_VALUE) return -1;
        return min;
    }
}
