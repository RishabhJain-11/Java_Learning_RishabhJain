package com.dsajavarev;

public class ConvertToRoman {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(convertToRoman(n));
    }
    static String convertToRoman(int n) {
        String[] units={"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String[] tens={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] hundreds = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] thousands={"","M","MM","MMM"};
        String str=Integer.toString(n);
        String res="";
        return thousands[n/1000]+hundreds[(n%1000)/100]+tens[(n%100)/10]+units[(n%10)];
    }
}
