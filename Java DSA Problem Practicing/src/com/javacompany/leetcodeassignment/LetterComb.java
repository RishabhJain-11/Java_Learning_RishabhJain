package com.javacompany.leetcodeassignment;
//https://leetcode.com/problems/letter-combinations-of-a-phone-number/
//17. Letter Combinations of a Phone Number


import java.util.ArrayList;

public class LetterComb {
    public static void main(String[] args) {
//        pad("","12");
//        System.out.println(padRet("", "12").size());
//        System.out.println(padRet("", "12"));
        System.out.println(padCount("", "12"));
    }//Debug it and See

    static void pad(String p ,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit =up.charAt(0) - '0';//this will convert '2' to 2
        for (int i = (digit-1) * 3; i < digit * 3; i++) {
            char ch  = (char)('a' + i);
            pad(p+ch , up.substring(1));
        }
        }

// Via ArraylistApproach
        static ArrayList<String> padRet(String p, String up) {
            if (up.isEmpty()) {
                ArrayList<String> list = new ArrayList<>();
                list.add(p);
                return list;
            }
            int digit = up.charAt(0) - '0'; // this will convert '2' into 2

            ArrayList<String> list = new ArrayList<>();

            for (int i = (digit - 1) * 3; i < digit * 3; i++) {
                char ch = (char) ('a' + i);
                list.addAll(padRet(p + ch, up.substring(1)));
            }
            return list;
    }
    static int padCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int count = 0;
        int digit = up.charAt(0) - '0'; // this will convert '2' into 2
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            count = count + padCount(p + ch, up.substring(1));
        }
        return count;
    }
}
/*
// LinkedList<String> ans = new LinkedList<String>();
		// if(digits.isEmpty()) return ans;
		// String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		// ans.add("");
		// for(int i =0; i<digits.length();i++){
		// 	int x = Character.getNumericValue(digits.charAt(i));
		// 	while(ans.peek().length()==i){
		// 		String t = ans.remove();
		// 		for(char s : mapping[x].toCharArray())
		// 			ans.add(t+s);
		// 	}
		// }
		// return ans;
 */