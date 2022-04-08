package com.dsajavarev;

public class SumOfNumbersInAString {
    public static void main(String[] args) {
        String str = "1acbf4sdfw5";
        System.out.println(findSum(str));
    }
    public static long findSum(String str)
    {
        // your code here
        StringBuilder temp = new StringBuilder("0");
        int n  = str.length();
        int sum = 0;
        for(int i = 0;i < n;i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch))
                temp.append(ch);
            else{
                sum = sum + Integer.parseInt(temp.toString());
                temp = new StringBuilder("0");
            }
        }
        return sum + Integer.parseInt(temp.toString());
    }
}
