package com.recursionString;

public class Main {

    public static void main(String[] args) {
	/*
        Q : Remove all the a's from the String
        for example : baccai
        result = bcci
*/
/*
        1] Pass the ans String in the argument -> can be call to the future calls
        2] Create the ans variable in function body -> new

        String : baccad  ans :bccd
        1] Initially the ans is going to be empty
        2] Is b similar to a [No it's not] then call different function.
        3] Is a equal to a then skip it.
        4] Is c similar to a [No it's not] then call different function.
        5] Is c similar to a [No it's not] then call different function.
        6] Is a similar to a  then skip it.
        7] Is d similar to a  [No it's not] then call different function.

        So return all the arguments from where it was called.
         */

        skip("","baccai");
    }

    static void skip (String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        if(ch == 'a'){
            skip(p,up.substring(1));
        }else{
            skip(p + ch,up.substring(1));
        }
    }
}
