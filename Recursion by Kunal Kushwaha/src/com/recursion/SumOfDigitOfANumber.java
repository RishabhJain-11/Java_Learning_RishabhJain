package com.recursion;

public class SumOfDigitOfANumber {
    public static void main(String[] args) {
        int result = Sum(12345);
        System.out.println("The sum of digit is = "+result);
//        int result1 = product(12345);
//        System.out.println("The product of digit is = "+result1);

    }
    static int Sum(int n ){
        if(n==0)
            return 0;
        return n%10+Sum(n/10);
    }
//static int product(int n ){
//        if(n==0)
//            return 0;
//        return n%10 * product(n/10);
//    }
}
/*
The step-by-step process for a better understanding of how the algorithm works.
Let the number be 12345.
Step 1-> 12345 % 10 which is equal-too 5 + ( send 12345/10 to next step )
Step 2-> 1234 % 10 which is equal-too 4 + ( send 1234/10 to next step )
Step 3-> 123 % 10 which is equal-too 3 + ( send 123/10 to next step )
Step 4-> 12 % 10 which is equal-too 2 + ( send 12/10 to next step )
Step 5-> 1 % 10 which is equal-too 1 + ( send 1/10 to next step )
Step 6-> 0 algorithm stops
following diagram will illustrate the process of recursion
 */