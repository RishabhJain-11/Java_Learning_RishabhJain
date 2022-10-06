package com.dsajavarev;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
/*
        int[] digits = {4,3,2,1};
        int[] digits = {9};
*/
        int[] digits = {4,9,9,9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i = n-1;i >= 0;i--){
            if(digits[i] < 9){
                digits[i] = digits[i] + 1;
                return digits;
            }
            // if the value is greater than 9 make the current value to be zero
            digits[i] = 0;
        }
        // for adding the power remaining when adding one to 9.
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        return newNumber;
    }
}
