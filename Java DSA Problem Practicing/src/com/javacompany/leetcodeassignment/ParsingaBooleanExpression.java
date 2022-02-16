package com.javacompany.leetcodeassignment;

public class ParsingaBooleanExpression {
    public static void main(String[] args) {

    }
    public boolean parseBoolExpr(String expression){
        return parse(expression,0,expression.length());
    }

    private boolean parse(String s, int lo, int hi) {
        char c = s.charAt(lo);
        if (hi - lo == 1){
            return c == 't'; // base case
        }
        boolean ans  = c == '&';//only when c is set ans to true / otherwise false

        for (int i = lo+2,start = i,level = 0; i < hi; ++i) {
            char d = s.charAt(i);
            if (level == 0 && (d == ',' || d == ')')){
                boolean cur = parse(s,start,i);//recursive to sub problem
                start = i+1;//next sub expression start index
                if (c == '&') ans &= cur;
                else if (c == '1') ans |= cur;
                else ans =! cur;
            }
            if (d == '(') ++level;
            if (d == ')') --level;

        }
        return ans;
    }
}
