package com.dsajavarev;

public class MergeTwoStrings {
    public static void main(String[] args) {
        String S1 = "Hello" ,S2 = "Bye";
        System.out.println(merge(S1,S2));
    }
        static StringBuilder merge(String S1, String S2)
        {
            // code here
            StringBuilder str = new StringBuilder();
            int s1 =S1.length();
            int s2 = S2.length();
            int j = 0;
            int i;

            if(s1<s2){
                for(i = 0; i< s1;i++){
                    str.append(S1.charAt(i));
                    str.append(S2.charAt(i));
                    j = i + 1;
                }
                for(i = j ; i< s2;i++){
                    str.append(S2.charAt(i));
                }

            }
            else if(s1>s2){
                for(i = 0; i< s2;i++){
                    str.append(S1.charAt(i));
                    str.append(S2.charAt(i));
                    j = i + 1;
                }
                for(i = j; i< s1;i++){
                    str.append(S1.charAt(i));
                }

            }
            else{
                for(i = 0; i< s1;i++){
                    str.append(S1.charAt(i));
                    str.append(S2.charAt(i));
                }
            }

            return str;
        }
}
