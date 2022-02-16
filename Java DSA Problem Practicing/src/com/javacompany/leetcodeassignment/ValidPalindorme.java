package com.javacompany.leetcodeassignment;

public class ValidPalindorme {
    public static void main(String[] args) {
        String ad = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome2(ad));
    }


    static boolean isPalindrome2(String s){
        char[] c = s.toCharArray();
        for (int i = 0,j = c.length-1; i < j;) {
            if (!Character.isLetterOrDigit(c[i])) i++;
            else if (!Character.isLetterOrDigit(c[j])) j--;
            else if (Character.toLowerCase(c[i++]) != Character.toLowerCase(c[j--]))
                return false;
        }
        return true;
    }

    static boolean isPalindrome(String s){
        if(s.isEmpty()){
            return true;
        }

        int head = 0,tail = s.length()-1;
        char cHead,cTail;
        while (head <= tail){
            cHead = s.charAt(head);
            cTail = s.charAt(tail);

            if (!Character.isLetterOrDigit(cHead)){
                head ++;
            }else if (!Character.isLetterOrDigit(cTail)){
                tail--;
            }else{
                if(Character.toLowerCase(cHead)!=Character.toLowerCase(cTail)){
                    return false;
                }
                head ++ ;
                tail -- ;
            }
        }
        return true;
    }
}
