package com.dsajavarev;

public class RemoveAllAdjacentDuplicates {
    public static void main(String[] args) {
        String s = "deeedbbcccbdaa";
        int k = 2;
        System.out.println(removeDuplicates(s,k));
    }
    public static String removeDuplicates(String s, int k) {
        int i = 0;
        int n = s.length();
        int[] count = new int[n];
        char[] stack = s.toCharArray();
        for(int j = 0;j < n;++j,++i){
            stack[i] = stack[j];
            count[i] = i > 0 && stack[i - 1] == stack[j] ? count[i - 1] + 1 : 1;
            if(count[i] == k) i -= k;
        }
        return new String(stack,0,i);
    }
}
