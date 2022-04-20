package com.dsajavarev;

public class StringWithNumbersAtItsEnd {
    public static void main(String[] args) {
        String s = "geeks5";
        System.out.println(isSame(s));
    }
    public static int isSame(String s)
    {
        StringBuilder num = new StringBuilder();
        int words = 0;
        for(int i =0;i<s.length();i++)
        {
            if(s.charAt(i)=='0'||s.charAt(i)=='1'||s.charAt(i)=='2'||s.charAt(i)=='3'||s.charAt(i)=='4'||s.charAt(i)=='5'
                    ||s.charAt(i)=='6'||s.charAt(i)=='7'||s.charAt(i)=='8'||s.charAt(i)=='9')
            {
                num.append(s.charAt(i));
            }
            else
            {
                words++;
            }
        }
        int num2 = 0;
        int mul = 1;
        for(int i =num.length()-1;i>=0;i--)
        {
            num2= num2+(num.charAt(i)-'0')*mul;
            mul = mul*10;
        }
        if(words!=num2)
        {
            return 0;
        }
        return 1;
    }
}
