package com.javacompany.leetcodeassignment;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {

        String roman = "MCMXCIV";
        System.out.println(romanToInt(roman));
    }
    //Optimal Solution

    static int romanToInt(String s){
        int sum = 0;
        if(s.indexOf("IV") != -1){
            sum -= 2;
        }

        if(s.indexOf("IX") != -1){
            sum -= 2;
        }
        if(s.indexOf("XL") != -1){
            sum -= 20;
        }
        if(s.indexOf("XC") != -1){
            sum -= 20;
        }
        if(s.indexOf("CD") != -1){
            sum -= 200;
        }
        if(s.indexOf("CM") != -1){
            sum -= 200;
        }

        char c[] = s.toCharArray();

        int count = 0;

        for (;count<=s.length()-1;count++){
            if(c[count] == 'M') sum+=1000;
            if(c[count] == 'D') sum+=500;
            if(c[count] == 'C') sum+=100;
            if(c[count] == 'L') sum+=50;
            if(c[count] == 'X') sum+=10;
            if(c[count] == 'V') sum+=5;
            if(c[count] == 'I') sum+=1;
        }
        return sum;
    }



    //Brute force
    /*
    static int romanToInt(String s){
        if(s == ""){
            return 0;
        }
        String[] sArr = s.split("");

        Map<String,Integer> romanToInt = new HashMap<>();
        romanToInt.put("I",1);
        romanToInt.put("V",5);
        romanToInt.put("X",10);
        romanToInt.put("L",50);
        romanToInt.put("C",100);
        romanToInt.put("D",500);
        romanToInt.put("M",1000);

        int sum = 0;

        for (int i = 0; i < sArr.length; i++) {
            Integer num = romanToInt.get(sArr[i]);
            if(num != null){
                if (i + 1 < sArr.length) {
                    Integer nextNum = romanToInt.get(sArr[i+1]);
                    if ("I".equals(sArr[i]) && ("V".equals(sArr[i+1])
                            || "X".equals(sArr[i+1]))) {
                        sum += nextNum - 1;
                        i++;
                    } else if ("X".equals(sArr[i]) && ("L".equals(sArr[i+1])
                            || "C".equals(sArr[i+1]))) {
                        sum += nextNum - 10;
                        i++;
                    } else if ("C".equals(sArr[i]) && ("D".equals(sArr[i+1])
                            || "M".equals(sArr[i+1]))) {
                        sum += nextNum - 100;
                        i++;
                    } else {
                        sum += num;
                    }
                } else {
                    sum += num;
                }
            }
        }
        return sum;
    }

     */
}
