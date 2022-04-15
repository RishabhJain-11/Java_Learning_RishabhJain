package com.dsajavarev;
//https://practice.geeksforgeeks.org/problems/longest-substring-containing-1/1/?page=1&difficulty[]=-1&status[]=unsolved&company[]=Amazon&company[]=Microsoft&company[]=Flipkart&company[]=Adobe&company[]=Google&company[]=Zoho&company[]=Paytm&company[]=Morgan%20Stanley&company[]=Goldman%20Sachs&company[]=Walmart&company[]=D-E-Shaw&company[]=Ola%20Cabs&company[]=VMWare&company[]=Qualcomm&company[]=Intuit%20&company[]=Directi&company[]=Linkedin&company[]=Salesforce&company[]=Codenation&company[]=PayPal&company[]=Nagarro%20&company[]=GE&company[]=Media.net%20&category[]=Strings&sortBy=submissions#
public class LongestSubstringContainingOne {
    public static void main(String[] args) {
        String s = "01110221211111134296063509";
        System.out.println(count(s));
    }
    public static int count(String s)
    {
        int max = 0,count = 0,len = s.length();
        for(int i = 0;i < len;i++){
            if(s.charAt(i) == '1'){
                count++;
                max = Math.max(count,max);
            }
            else
                count = 0;
        }
        return max;
    }
}
