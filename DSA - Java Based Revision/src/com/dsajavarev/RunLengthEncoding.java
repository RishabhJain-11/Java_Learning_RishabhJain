package com.dsajavarev;

public class RunLengthEncoding {
    public static void main(String[] args) {
        String str = "aaabbcddddd";
        System.out.println(encode(str));
    }
    public static String encode(String str)
    {
        //Your code here
        StringBuilder ss = new StringBuilder();//initially it is going to be a empty string.
        int len = 1;//the length num we are going to add is going to be 1 initially.
        for(int i = 0;i < str.length();i++){//running a for loop for string
            if(i != 0){// unless i != 0.
                if(str.charAt(i) != str.charAt(i-1)){ // if the curr and next letters are not same then go into the loop
                    ss.append(len);// do the following process and add String with length.
                    ss.append(str.charAt(i));//
                    len = 1;
                }
                else{
                    len++;//or the length keeps on increasing.
                }
            }
            else{
                ss.append(str.charAt(i));//do the addition of char and times it has been repeated.
            }
        }
        ss.append(len);
        return ss.toString();// return the whole string.
    }
}
