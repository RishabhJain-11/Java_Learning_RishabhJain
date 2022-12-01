package com.dsajavarev;

import java.util.Set;
import java.util.stream.IntStream;

public class DetermineIfStringsHalvesAreAlike {
    public static void main(String[] args) {
        String s = "book";
        System.out.println(halvesAreAlike(s));
    }
    private static final Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

    private static long count(String s, int from, int to){
        return IntStream.range(from, to).filter(i -> !vowels.contains(s.charAt(i))).count();
    }

    public static boolean halvesAreAlike(String s){
        return count(s, 0, s.length() / 2) == count(s, s.length()/2, s.length());
    }
}
