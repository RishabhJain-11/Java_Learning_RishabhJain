package com.dsajavarev;

import java.util.Stack;
// Amazon Goldman Sachs IBM Intuit Kuliza Yahoo Microsoft
public class SortOfStack {
    public static void main(String[] args) {

    }
    public Stack<Integer> sort(Stack<Integer> s)
    {
        //add code here.
        find(s);
        return s;
    }
    public void find(Stack<Integer> s){
        if(!s.isEmpty()){
            int val = s.pop();
            find(s);
            insert(val,s);
        }
    }
    public void insert(int val,Stack<Integer> st){
        if(st.isEmpty()){
            st.push(val);
            return;
        }else{
            int x = st.peek();
            if(val < x){
                st.pop();
                insert(val,st);
                st.push(x);
            }else
                st.push(val);
        }
    }
}
