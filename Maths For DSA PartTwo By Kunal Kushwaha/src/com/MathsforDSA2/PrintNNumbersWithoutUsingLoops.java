package com.MathsforDSA2;

public class PrintNNumbersWithoutUsingLoops {

    public static void main(String[] args) {

        System.out.println(printNos(10));
    }


        static int printNos(int n)
        {
            //Your code here
            if(n > 0)
            {
                printNos(n - 1);
                System.out.print(n + " ");
            }
            return -1;
        }


}
