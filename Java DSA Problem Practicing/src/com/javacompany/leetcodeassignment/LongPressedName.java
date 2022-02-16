package com.javacompany.leetcodeassignment;

public class LongPressedName {
    public static void main(String[] args) {

        String name = "leelee";
        String typed = "lleeelee";
        System.out.println(longPressedName(name,typed));

    }
    static boolean longPressedName(String name,String typed){
/*
        int diff = 0;
        for (int i = 0; i < t.length();) {
            if (diff <= i  && i-diff < n.length() && t.charAt(i) == n.charAt(i-diff)){
                i++;
            }else if (diff < i  && i-diff-1 < n.length() && t.charAt(i) == n.charAt(i-diff-1)) {
                diff++;
            }
            else
                return false;
        }
        return t.length() - diff == n.length();
******************************************************************************************************************************

*/

        int  i = 0,m = name.length(),n = typed.length();
        for (int j = 0; j < n; j++) {
            if (i<m && name.charAt(i) == typed.charAt(j))
                ++i;
            else if (j == 0 || typed.charAt(j) != typed.charAt(j-1))
                return false;
        }
        return i == m;
    }
}


/*
public boolean isLongPressedName(String name, String typed) {
    int n = name.length();
    int m = typed.length();
    if (n > m) return false;
    char[] a = name.toCharArray();
    char[] b = typed.toCharArray();
    int i = 0, j = 0;
    while (a[i++] == b[j++] && j < m) {
        if (b[j] == b[j-1] && (i == n || a[i] != a[i-1])) i--;
    }
    return i == n && j == m;
}
 */
