package com.recursionpermutations;

import java.util.ArrayList;

//Permutations
public class Main {
    public static void main(String[] args) {
	// write your code here
//        permutations("","abc");


//        ArrayList<String> ans = permutationsList("","abc");
//        System.out.println(ans);
        System.out.println(permutations1("","abcd"));
    }



    static void permutations(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length() ; i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permutations(f+ch+s,up.substring(1));
        }
    }



    // through ArrayList
    static ArrayList<String> permutationsList(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= p.length() ; i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            ans.addAll(permutationsList(f+ch+s,up.substring(1)));
        }
        return ans;
    }


    static int permutations1(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return 1;
        }
         int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length() ; i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            count = count + (permutations1(f+ch+s,up.substring(1)));
        }
        return count;
    }
}
