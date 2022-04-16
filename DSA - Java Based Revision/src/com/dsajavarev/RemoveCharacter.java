package com.dsajavarev;
//https://practice.geeksforgeeks.org/problems/remove-character3815/1/?page=1&difficulty[]=-1&status[]=unsolved&company[]=Amazon&company[]=Microsoft&company[]=Flipkart&company[]=Adobe&company[]=Google&company[]=Zoho&company[]=Paytm&company[]=Morgan%20Stanley&company[]=Goldman%20Sachs&company[]=Walmart&company[]=D-E-Shaw&company[]=Ola%20Cabs&company[]=VMWare&company[]=Qualcomm&company[]=Intuit%20&company[]=Directi&company[]=Linkedin&company[]=Salesforce&company[]=Codenation&company[]=PayPal&company[]=Nagarro%20&company[]=GE&company[]=Media.net%20&category[]=Strings&sortBy=submissions
public class RemoveCharacter {
    public static void main(String[] args) {
        String string1 = "computer";
        String string2 = "cat";
        System.out.println(removeChars(string1,string2));
    }
    static String removeChars(String string1, String string2){
        // code here
        StringBuilder s = new StringBuilder();//resultant empty string.
        for(int i = 0;i < string1.length();i++){
            if(!string2.contains(String.valueOf(string1.charAt(i)))){
                s.append(string1.charAt(i));
            }
        }
        return s.toString();
    }
}
