package com.dsajavarev;

public class DifficultyOfSentence {
    public static void main(String[] args) {
        String S = "Difficulty of sentence";
        System.out.println(calcDiff(S));
    }
    static boolean isVowel(char ch)
    {
        return ( ch == 'a' || ch == 'e' ||
                ch == 'i' || ch == 'o' ||
                ch == 'u');
    }
    static public int calcDiff(String s)
    {
        //code here
        int count_vowels = 0, count_conso = 0;
        int hard_words = 0, easy_words = 0;
        int consec_conso = 0;

        // Start traversing the string
        for (int i = 0; i < s.length(); i++)
        {
            // Check if current character is vowel
            // or consonant
            if (s.charAt(i) != ' ' && isVowel(Character.toLowerCase(s.charAt(i))))
            {
                // Increment if vowel
                count_vowels++;
                consec_conso = 0;
            }
            else if (s.charAt(i)!= ' ')
            {
                count_conso++;
                consec_conso++;
            }

            // If we get 4 consecutive consonants
            // then it is a hard word
            if (consec_conso == 4)
            {
                hard_words++;

                // Move to the next word
                while (i < s.length() && s.charAt(i)!= ' ')
                    i++;

                // Reset all counts
                count_conso = 0;
                count_vowels = 0;
                consec_conso = 0;
            }

            else if (s.charAt(i) == ' ' || i == s.length() - 1)
            {

                if(count_conso > count_vowels)
                    hard_words++;
                else
                    easy_words++;

                // Reset all counts
                count_conso = 0;
                count_vowels = 0;
                consec_conso = 0;
            }
        }
        return 5 * hard_words + 3 * easy_words;
    }
}
