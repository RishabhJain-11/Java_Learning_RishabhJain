package com.dsajavarev;

public class EncryptTheString {
    public static void main(String[] args) {
        String a = "aabc";
        System.out.println(encryptString(a));
    }
    public static String encryptString(String s)
    {
        // code here
        StringBuilder output = new StringBuilder();
        int i =0,j=0;
        int count =0;
        while(i < s.length() && j <s.length()){
            char ch = s.charAt(j);
            if(s.charAt(i) == s.charAt(j)) {
                count++;
                j++;
            }
            else{
                output.append(s.charAt(i));
                output.append(count);
                i=j;
                count =0;
            }
        }
        output.append(s.charAt(i));
        output.append(count);
        // String revOutput = "";
        StringBuilder revOutput =  new StringBuilder();
        for(int k= output.length() -1 ; k>=0;k--){
            // revOutput = revOutput +output.charAt(k);
            revOutput.append(output.charAt(k));
        }

        return revOutput.toString();
    }
}
