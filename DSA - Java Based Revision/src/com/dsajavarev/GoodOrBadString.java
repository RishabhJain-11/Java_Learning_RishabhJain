package com.dsajavarev;

public class GoodOrBadString {
    public static void main(String[] args) {
        String s = "aeioup??";
        System.out.println(isGoodorBad(s));
    }
    static int isGoodorBad(String S) {
        // code here
        int vc = 0, cc= 0;
        for(char c: S.toCharArray())
            if(vc>5||cc>3)
                return 0;
            else if(c=='?')
            {
                vc++;
                cc++;
            }
            else if("AEIOUaeiou".indexOf(c)>-1)
            {
                vc++;
                cc=0;
            }
            else
            {
                cc++;
                vc=0;
            }
        return 1;
    }
}
