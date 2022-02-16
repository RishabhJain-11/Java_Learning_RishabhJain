package com.sorting;

import java.util.Arrays;

//bubble sort --> sinking sort or exchange sort
//it does not make sense to compare the same elements which have been sorted
//so the counter will go till (length - 1 - i)
//time complexity of bubble sort = O(n) -->best case  /// worst case --->O(n^2)
//space complexity = O(1) constant
//also known as in place sorting algorithms'
//when j never swaps for a value of i it means array is sorted , hence you can end the program.
public class Main {
    public static void main(String[] args) {
	// write your code here
        int[] arr = {3,2,1,5,7};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubblesort(int[] arr){
        boolean swapped;
        //run the stepd n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j <arr.length-i-1 ; j++) {
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            //if you did not swap for a particular i thaen the array is sorted then break
            if(!swapped){
                break;
            }
        }
    }
}
