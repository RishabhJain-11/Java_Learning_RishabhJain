package com.javacompany.leetcodeassignment;

public class IsNumberValid {
    public static void main(String[] args) {
        String s = "1E9";
        System.out.println(isNumber(s));
    }

    static  boolean isNumber(String s){
/*
        s = s.trim();
        boolean pointSeen = false;
        boolean eSeen = false ;
        boolean numberSeen = false;

        for (int i = 0; i < s.length(); i++) {
            if('0' < s.charAt(i) && s.charAt(i)<='9'){
                numberSeen = true;
            } else if (s.charAt(i) == '.') {
                if (eSeen || pointSeen)
                    return false;
                pointSeen = true;
            }else if (s.charAt(i) == 'e'){
                if(eSeen || !numberSeen)
                    return false;
                numberSeen = false;
                eSeen = true;
            }else if (s.charAt(i) == '-' || s.charAt(i) == '+'){
                if(i!=0 && s.charAt(i-1) != 'e')
                    return  false;
            }else
                return false;
        }return numberSeen;
*/
/*
        s = s.trim();

        boolean pointSeen = false;
        boolean eSeen = false;
        boolean numberSeen = false;
        boolean numberAfterE = true;
        for(int i=0; i<s.length(); i++) {
            if('0' <= s.charAt(i) && s.charAt(i) <= '9') {
                numberSeen = true;
                numberAfterE = true;
            } else if(s.charAt(i) == '.') {
                if(eSeen || pointSeen) {
                    return false;
                }
                pointSeen = true;
            } else if(s.charAt(i) == 'e') {
                if(eSeen || !numberSeen) {
                    return false;
                }
                numberAfterE = false;
                eSeen = true;
            } else if(s.charAt(i) == '-' || s.charAt(i) == '+') {
                if(i != 0 && s.charAt(i-1) != 'e') {
                    return false;
                }
            } else {
                return false;
            }
        }

        return numberSeen && numberAfterE;
*/

        s = s.toLowerCase().trim();
        boolean dotSeen = false;
        boolean eSeen   = false;
        boolean numberBeforeE = false;
        boolean numberAfterE  = false;
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if ('0' <= cur && cur <= '9') {
                if (!eSeen) numberBeforeE = true;
                if (eSeen)  numberAfterE  = true;
            } else if (cur == '-' || cur == '+') {
                if (i != 0 && s.charAt(i - 1) != 'e') return false;
            } else if (cur == '.') {
                if (eSeen || dotSeen) return false;
                dotSeen = true;
            } else if (cur == 'e' ) {
                if (eSeen) return false;
                eSeen = true;
            } else { // invalid chars
                return false;
            }
        }
        return eSeen ? (numberBeforeE && numberAfterE) : numberBeforeE;
    }
}
