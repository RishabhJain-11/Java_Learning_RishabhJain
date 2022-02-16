package com.recursionString.subset;

import java.util.ArrayList;

public class AsciiValueOfchar {
    public static void main(String[] args) {
        System.out.println(subsetAscii("","abc"));

    }
    static void  subseqascii(String p ,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseqascii(p + ch,up.substring(1));
        subseqascii(p,up.substring(1));
        subseqascii(p + (ch + 0),up.substring(1));
    }



    static ArrayList<String> subsetAscii(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = subsetAscii(p + ch,up.substring(1));
        ArrayList<String> sec = subsetAscii(p,up.substring(1));
        ArrayList<String> third = subsetAscii(p + (ch + 0),up.substring(1));
        first.addAll(sec);
        first.addAll(third);
        return first;
    }

}

/*
Q How to get the ascii value Code
psvm{
char ch = 'a''
sout(ch + 0);//ans = 97
}

 */