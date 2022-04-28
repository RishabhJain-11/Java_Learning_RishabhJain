package com.dsajavarev;

import java.util.ArrayList;
import java.util.Stack;

public class PrintBraketNumber {
    public static void main(String[] args) {

    }
    ArrayList<Integer> barcketNumbers(String S) {
        // code here
        ArrayList<Integer> li=new ArrayList<Integer>();
        Stack<Integer> st=new Stack<Integer>();
        int count=0;
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i) == '(')
            {
                count++;
                st.push(count);
                li.add(count);
            }
            if(S.charAt(i) == ')')
            {
                if(!st.isEmpty())
                {
                    int v=st.peek();
                    st.pop();
                    li.add(v);
                }
            }
        }
        return li;
    }
}
