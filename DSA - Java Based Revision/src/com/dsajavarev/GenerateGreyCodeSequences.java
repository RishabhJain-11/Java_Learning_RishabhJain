package com.dsajavarev;

import java.util.ArrayList;

public class GenerateGreyCodeSequences {
    public static void main(String[] args) {

    }
    ArrayList<String> res = new ArrayList<String>();
    void greyCode(String s,int value,int level,int n){
        if(level == n){
            res.add(s);
            return;
        }
        if(value == 0){
            greyCode(s+"0",0,level+1,n);
            greyCode(s+"1",1,level+1,n);
        }
        else if(value == 1){
            greyCode(s+"1",0,level+1,n);
            greyCode(s+"0",1,level+1,n);
        }
    }
    ArrayList <String> generateCode(int n)
    {
        // Your code here
        if(!res.isEmpty()){
            res.clear();
        }
        greyCode("",0,0,n);
        return res;
    }
}
