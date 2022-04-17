package com.dsajavarev;

import java.util.ArrayList;

public class PrintAllPossibleStrings {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(spaceString(str));
    }
    static ArrayList<String> spaceString(String str) {
        ArrayList<String> res = new ArrayList<String>();
        helper(str, str, "", res);
        return res;
    }

    static void helper(String str, String ip, String op, ArrayList<String> res) {
        if (str.length() == ip.length()) {
            op = "" + str.charAt(0);
            ip = str.substring(1);

            helper(str, ip, op, res);
        }
        else {
            if (ip.length() == 0) {
                res.add(op);
                return;
            }

            String op1 = op + " " + ip.charAt(0);
            String op2 = op + ip.charAt(0);
            ip = ip.substring(1);

            helper(str, ip, op2, res);
            helper(str, ip, op1, res);
        }
    }
}
