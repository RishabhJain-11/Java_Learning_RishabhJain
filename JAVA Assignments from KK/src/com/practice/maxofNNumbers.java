package com.practice;

import java.util.Scanner;

 class maxofNNumbers {
     static int getMax(int n ){
         int max = 0;
         int rem ;
         while(n!=0){
             rem = n%10;
             n=n/10;

             if(rem > max ){
                 max =rem;
             }

         }
         return max;
     }

     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         System.out.println("Enter the integer :");
         int n = in.nextInt();
         System.out.println(getMax(n));
     }

}






//class sumofallnumbers
//{
//    static int getSum (int n)
//    {
//        int sum = 0;
//        while(n!=0)
//        {
//            sum = sum + n%10;
//            n = n/10;
//        }
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter Integers :");
//        int n = in.nextInt();
//        System.out.println(getSum(n));
//
//    }
//
//}
