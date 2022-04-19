package com.dsajavarev;

public class FindKthCharacterInAString {
    public static void main(String[] args) {
        int m = 5, n = 2, k = 5;
        System.out.println(kthCharacter(m,n,k));
    }
    static char kthCharacter(int m, int n, int k) {
        // code here
        String bin = Integer.toBinaryString(m);
        StringBuilder res = new StringBuilder();
        while(n!=0)
        {
            for(int i=0;i<bin.length();i++)
            {
                if(bin.charAt(i)=='0')
                {
                    res.append("01");
                }
                else
                {
                    res.append("10");
                }
            }
            bin = res.toString();
            res = new StringBuilder();
            n--;
        }

        return bin.charAt(k-1);
    }
}
