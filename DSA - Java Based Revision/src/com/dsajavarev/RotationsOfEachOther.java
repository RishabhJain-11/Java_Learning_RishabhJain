package com.dsajavarev;

public class RotationsOfEachOther {
    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        String s2 = "forgeeksgeeks";
        System.out.println(areRotations(s1,s2));
    }
    public static boolean areRotations(String s1, String s2 )
    {
        // Your code here
        int length = s1.length();
        if(length != s2.length()) {
            return false;
        }

        int x = 0;
        int y = 0;
        int matchCount = 0;
        int loopCount = 0;

        while(true) {
            loopCount++;
            if(loopCount > (3*length)) {
                break;
            }
            if(matchCount == length) {
                return true;
            }
            if(s1.charAt(x) == s2.charAt(y)) {
                matchCount++;
            } else {
                y++;
                if(y==length) y=0;
                matchCount = 0;
                continue;
            }
            x++;
            y++;
            if(x==length) x=0;
            if(y==length) y=0;
        }
        return false;
    }
}
