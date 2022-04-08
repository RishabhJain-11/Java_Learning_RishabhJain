package com.dsajavarev;

public class BinaryString {
    public static void main(String[] args) {
        int a = 4;
        String str = "1111";
        System.out.println(binarySubstring(a,str));
    }
    public static int binarySubstring(int a, String str)
    {
        // Your code here
        int res = 0;
        int count = -1;

        for(int i = 0;i < a;i++){
            if(str.charAt(i) == '1'){
                count++;
                res+=count;
            }
        }
        return res;
    }
}
