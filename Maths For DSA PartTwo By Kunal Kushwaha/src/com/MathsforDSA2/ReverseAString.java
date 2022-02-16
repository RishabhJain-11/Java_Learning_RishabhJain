package com.MathsforDSA2;

public class ReverseAString {
    public static void main(String[] args) {

        String str = "Geeks for Geeks";
        ReverseAString obj = new ReverseAString();
        obj.reverse(str);
    }
    static void reverse(String str){

        if(((str == null) && (str.length() <= 1)))
            System.out.println(str);
        else
            System.out.print(str.charAt(str.length()-1));
        reverse(str.substring(0,str.length()-1));
    }
    /*
    void reverse(String str)
    {
        if ((str==null)||(str.length() <= 1))
            System.out.println(str);
        else
        {
            System.out.print(str.charAt(str.length()-1));
            reverse(str.substring(0,str.length()-1));
        }
    }*/
}
