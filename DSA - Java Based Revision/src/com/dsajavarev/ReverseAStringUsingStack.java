package com.dsajavarev;

import java.util.Stack;

public class ReverseAStringUsingStack {
    public static void main(String[] args) {
        String s = "GeeksforGeeks";
        System.out.println(reverse(s));
    }
    public static String reverse(String S){
        //code here
        StringBuilder res = new StringBuilder();//intially the string is set to nothing

        Stack<Character> st = new Stack<>();//used stack to reverse the string
        int i = 0;// for traversing the string the i isset to 0
        while(i != S.length()){//going to be using a while loop
            st.push(S.charAt(i));//unless the size reaches the max limit push it in the stack
            i++;//and move the pushing pointer
        }
        while(st.size() != 0){
            res.append(st.pop());//after pusing of all the string characters pop it out one by one.
        }//store the popped out characters in resultant string
        return res.toString();//after storing just return it.
    }
}
