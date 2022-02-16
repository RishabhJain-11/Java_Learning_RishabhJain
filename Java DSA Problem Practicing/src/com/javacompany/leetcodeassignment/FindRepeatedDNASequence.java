package com.javacompany.leetcodeassignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//Hash Set
//Array List
//Mapping
public class FindRepeatedDNASequence {
    public static void main(String[] args) {
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        System.out.println(findRepeatedDnaString(s));
    }
    static List<String> findRepeatedDnaString(String s){
        Set<Integer> words = new HashSet<>();
        Set<Integer> doublewords = new HashSet<>();
        List<String> rv = new ArrayList<>();
        char[] map = new char[26];
        map['C' - 'A'] = 1;
        map['G' - 'A'] = 2;
        map['T' - 'A'] = 3;

        for (int i = 0; i < s.length()-9; i++) {
            int v = 0 ;
            for (int j = i; j < i+10; j++) {
                v <<= 2;
                v |= map[s.charAt(j) - 'A'];
            }
            if(!words.add(v) && doublewords.add(v)){
                rv.add(s.substring(i,i+10));
            }
        }
        return rv;
    }

}
