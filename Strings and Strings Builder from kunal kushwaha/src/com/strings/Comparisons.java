package com.strings;

public class Comparisons {
    public static void main(String[] args) {
//        String a = "Rishabh";
//        String b = "Rishabh";
//        System.out.println(a.equals(b));
        String name1 = new String("Rishabh");
        String name2 = new String("Rishabh");

        System.out.println(name1 == name2);//it will return false -- it is a comparator
        System.out.println(name1.equals(name2));//it will return true  -- it is a method
        System.out.println(name1.charAt(0));//via this you can access the index of Strings


    }
    //how to create diff object of same value
//    String a = new String("Rishabh");
//    String b = new String("Rishabh");
    //creating the value outside the pool but in the heap


    //2] when you only need to check value use equals method

}
