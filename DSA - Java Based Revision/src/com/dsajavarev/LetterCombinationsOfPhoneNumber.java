package com.dsajavarev;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

public class LetterCombinationsOfPhoneNumber {
    public static void main(String[] args) {

    }

    public List<String> letterCombinations(String digits) {
        LinkedList<String> ans = new LinkedList<String>();
        if(digits.isEmpty()) return ans;
        String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ans.add("");
        IntStream.range(0, digits.length()).forEach(i -> {
            int x = Character.getNumericValue(digits.charAt(i));
            while (Objects.requireNonNull(ans.peek()).length() == i) {
                String t = ans.remove();
                for (char s : mapping[x].toCharArray())
                    ans.add(t + s);
            }
        });
        return ans;
    }
}
