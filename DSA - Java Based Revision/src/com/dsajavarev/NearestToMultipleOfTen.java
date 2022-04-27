package com.dsajavarev;

public class NearestToMultipleOfTen {
    public static void main(String[] args) {
        String n = "15";
        System.out.println(roundToNearest(n));
    }
    static String roundToNearest(String N)
    {
        // Complete the function
        int n = Integer.parseInt(String.valueOf(N.charAt(N.length()-1)));

        if(n == 0){
            return N;
        }
        StringBuilder s = new StringBuilder();
        if(n <= 5){
            for(int i = 0;i < N.length()-1;i++){
                s.append(N.charAt(i));
            }
            s.append('0');
        }
        else if(N.length() - 1 == 0){
            s.append("10");
        }
        else{
            for(int i = N.length() - 2;i >= 0;i--){
                if(N.charAt(i)=='9'){
                    s.append('0');
                }else{
                    s.append(N.charAt(i) - '0' + 1);

                    for(int j = i-1; j>=0; j--){
                        s.append(N.charAt(j));
                    }
                    break;
                }
            }
            if(s.charAt(s.length()-1) == '0'){
                s.append('1');
            }
            s.reverse();
            s.append('0');
        }
        return s.toString();
    }
}
