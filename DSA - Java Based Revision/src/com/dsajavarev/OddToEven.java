package com.dsajavarev;

public class OddToEven {
    public static void main(String[] args) {
        String s = "4543";
        System.out.println(makeEven(s));
    }
    public static String makeEven(String s)
    {
        //code here.
        char[] ch = s.toCharArray();
        int index = -11;
        int n = ch.length;
        for (int i = 0; i < n; i++) {
            int x = Character.getNumericValue(ch[i]);
            if (x % 2 == 0) {
                if (ch[i] < ch[n - 1]) {
                    char c = ch[i];
                    ch[i] = ch[n - 1];
                    ch[n - 1] = c;
                    return String.valueOf(ch);
                } else {
                    index = i;
                }
            }

        }
        if (index == -11) {
            return s;
        }
        char c = ch[index];
        ch[index] = ch[n - 1];
        ch[n - 1] = c;
        return String.valueOf(ch);
    }
}
