package com.strings;
/**
 * collection or sequence of characters
 * string is most used datatype in java class library
 * String = datatype
 * name=ref variable
 * "Rishabh Jain" = object
 */

//why we cant modify string object - for security reasons

public class Main {

    public static void main(String[] args) {
	// write your code here
        String name = "Rishabh Jain";
        System.out.println(name);

        String a = "Rishabh";
//        String b = "Rishabh";
        System.out.println(a);
        a="jain";
        System.out.println(a);
    }
}
