package com.strings;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');//ASCII value
        System.out.println("a"+"b");//will concatenate
        System.out.println('a'+3);//asscii value
        System.out.println((char) ('a'+3));
        System.out.println("a"+1);//it will concatenate
        //Note : when an integer is concatenated with a string it is converted to its wrapper class
        //Integer will be converted to Integer that will call toString()

        System.out.println("Kunal"+new ArrayList<>());//it will call the toString method
        System.out.println("Rishabh"+new Integer(11));
        System.out.println(new Integer(5)+" "+new ArrayList<>());//ther shuold be at least
        //Note : + can be used with only primitves
/*
rishabh
shreyas
shaw
dhawan
ashwin
axar
ishant
avesh
rabada*
notje*
marcus*
hetmyer*
mishra
lalit
ripal

 */
    }
}
