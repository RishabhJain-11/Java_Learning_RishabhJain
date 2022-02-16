package com.recursionString.subset;

import java.util.ArrayList;

public class Subset {
    public static void main(String[] args) {

        System.out.println(subset1("","abc"));
    }
    static void  subset(String p ,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subset(p + ch,up.substring(1));
        subset(p,up.substring(1));
    }

    static ArrayList<String> subset1(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subset1(p + ch,up.substring(1));
        ArrayList<String> right = subset1(p,up.substring(1));
        left.addAll(right);
        return left;
    }
}
    /*
    * Permutations and Combinations.
    * Subsets -> Non - adjacent combinations.
    * [3,5,6] -> [3] [3,5] , [3,5,9] ,[5] ,[9],[5,9].
    *
    * Subset Method - Recursion & Iteration.
    *
    * String = "abc";
    * ans = ["a","b","c","ab","ac","abc","bc"]
    *
    * * * This pattern of taking some and removing some elements and removing some is known as subset pattern.
    *
     */
