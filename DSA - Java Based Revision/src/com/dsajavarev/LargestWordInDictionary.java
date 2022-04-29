package com.dsajavarev;
//https://practice.geeksforgeeks.org/problems/find-largest-word-in-dictionary2430/1/?page=1&difficulty[]=0&status[]=unsolved&company[]=Amazon&company[]=Microsoft&company[]=Flipkart&company[]=Adobe&company[]=Google&company[]=Zoho&company[]=Paytm&company[]=Morgan%20Stanley&company[]=Goldman%20Sachs&company[]=Walmart&company[]=D-E-Shaw&company[]=Ola%20Cabs&company[]=VMWare&company[]=Qualcomm&company[]=Intuit%20&company[]=Directi&company[]=Linkedin&company[]=Salesforce&company[]=Codenation&company[]=PayPal&company[]=Media.net%20&company[]=Nagarro%20&company[]=GE&category[]=Strings&sortBy=submissions#
import java.util.Collections;
import java.util.List;

public class LargestWordInDictionary {
    public static void main(String[] args) {
//        List<String> d = {"ale", "apple", "monkey", "plea"};
        String S = "abpcplea";

    }
    static String findLongestWord(String s, List<String> d) {
        // code here
        Collections.sort(d);
        int n1 = s.length();
        StringBuilder res = new StringBuilder();

        for(String ele : d){
            int j = 0,k = 0;
            int n2 = ele.length();
            if(n2 > n1)
                continue;
            while(j < n2 && k < n1){
                char c = s.charAt(j);
                if(ele.charAt(j) == s.charAt(k))
                    j++;
                k++;
            }
            if(j == n2 && res.length() < ele.length()){
                res.setLength(0);
                res.append(ele);
            }
        }
        return res.toString();
    }
}
