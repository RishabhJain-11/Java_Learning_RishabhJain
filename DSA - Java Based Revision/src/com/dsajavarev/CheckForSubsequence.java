package com.dsajavarev;

public class CheckForSubsequence {
    public static void main(String[] args) {
        String A = "AXY";
        String B = "YADXCP";
        System.out.println(isSubSequence(A,B));
    }
    static boolean isSubSequence(String A, String B){
        //Accolite Amazon Tesco Zoho
        int j = 0,m = A.length(),n = B.length();
        for(int i = 0;i < n && j < m;i++){
            if(A.charAt(j) == B.charAt(i)) j++;
        }
        return (j == m);
    }
}
