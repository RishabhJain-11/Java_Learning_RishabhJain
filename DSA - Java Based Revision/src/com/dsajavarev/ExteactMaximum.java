package com.dsajavarev;

public class ExteactMaximum {
    public static void main(String[] args) {
        String s = "100klh564abc365bg";
        System.out.println(extractMaximum(s));
    }
    static int extractMaximum(String S) {
        int num=0, res=0, flag=0;
        for(int i=0;i<S.length();i++){
            if(Character.isDigit(S.charAt(i))){
                num = num * 10 + (S.charAt(i)-'0');
                flag=1;
            }
            else{
                res = Math.max(res, num);
                num = 0;
            }

        }
        if(flag==0){
            return -1;}
        else{
            return Math.max(res, num);
        }
    }
}
