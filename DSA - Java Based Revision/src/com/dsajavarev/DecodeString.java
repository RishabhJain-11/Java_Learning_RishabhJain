package com.dsajavarev;

public class DecodeString {
    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        System.out.println(decodeString(s));
    }
    static int i = 0;
    public static String decodeString(String s) {
            StringBuilder sb = new StringBuilder();

            while (i < s.length() && s.charAt(i) != ']') {
                if (!Character.isDigit(s.charAt(i))) {
                    sb.append(s.charAt(i++));
                } else {
                    int num = 0;
                    while (i < s.length() && Character.isDigit(s.charAt(i))) {
                        num = num * 10 + s.charAt(i++) - '0';
                    }
                    i++;
                    String decoded = decodeString(s);
                    while (num-- > 0) {
                        sb.append(decoded);
                    }
                    i++;
                }
            }
            return sb.toString();
        }
}
