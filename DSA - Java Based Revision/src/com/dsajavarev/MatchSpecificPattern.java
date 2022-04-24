package com.dsajavarev;
//https://practice.geeksforgeeks.org/problems/match-specific-pattern/1/?page=1&difficulty[]=0&status[]=unsolved&company[]=Amazon&company[]=Microsoft&company[]=Flipkart&company[]=Adobe&company[]=Google&company[]=Zoho&company[]=Paytm&company[]=Morgan%20Stanley&company[]=Goldman%20Sachs&company[]=Walmart&company[]=D-E-Shaw&company[]=Ola%20Cabs&company[]=VMWare&company[]=Qualcomm&company[]=Intuit%20&company[]=Directi&company[]=Linkedin&company[]=Salesforce&company[]=Codenation&company[]=PayPal&company[]=Nagarro%20&company[]=GE&company[]=Media.net%20&category[]=Strings&sortBy=submissions#
import java.util.ArrayList;
import java.util.HashMap;

public class MatchSpecificPattern {
    public static void main(String[] args) {
//        ArrayList [] dict = {abb,abc,xyz,xyy};
        String patter = "foo";
//        System.out.println(findMatchedWords(dict,patter));
    }

    public static ArrayList<String> findMatchedWords(ArrayList<String> dict, String pattern)
    {
        //add code here.
        String patt = findPattern(pattern , pattern.length());
        ArrayList<String> res = new ArrayList<>();

        for (String temp : dict) {
            if (temp.length() != pattern.length()) continue;
            if (patt.equals(findPattern(temp, temp.length())))
                res.add(temp);
        }
        return res;
    }
    static String findPattern(String s , int n){
        StringBuilder patt = new StringBuilder();
        int ind = 1;
        HashMap<Character , Integer> map = new HashMap<>();

        for(int i =  0; i < n; i++){
            if(map.containsKey(s.charAt(i))){
                String st = Integer.toString(map.get(s.charAt(i)));
                patt.append(st);
            }
            else{
                map.put(s.charAt(i) , ind);
                patt.append(Integer.toString(ind));
                ind++;
            }
        }
        return patt.toString();
    }
}
