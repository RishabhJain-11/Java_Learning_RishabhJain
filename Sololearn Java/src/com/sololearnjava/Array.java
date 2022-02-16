package com.sololearnjava;

import jdk.swing.interop.SwingInterOpUtils;

public class Array {

    public static void main(String[] args) {
        /*
        Note that elements in the array are identified with zero-based index numbers, meaning that the first element's index is 0 rather than one. So, the maximum index of the array int[5] is 4.
         */
//        String[] Myname = {"A","B","C","D"};
//        System.out.println(Myname[2]);
        //System.out.println(Myname.length);You can access the length of an array (the number of elements it stores) via its length property.



        /*
        Now that we know how to set and get array elements, we can calculate the sum of all elements in an array by using loops.
        The for loop is the most used loop when working with arrays, as we can use the length of the array to determine how many times to run the loop.
         */

        int[] arr ={3,5,6,8,74,45,667,6};
        int sum =0;
        for (int i = 0; i < arr.length; i++) {  //The condition of the for loop is x<myArr.length, as the last element's index is myArr.length-1.
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
