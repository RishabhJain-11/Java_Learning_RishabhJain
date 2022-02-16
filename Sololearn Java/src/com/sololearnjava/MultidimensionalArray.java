package com.sololearnjava;

public class MultidimensionalArray {
    public static void main(String[] args) {
        /*
        Multidimensional arrays are array that contain other arrays. The two-dimensional array is the most basic multidimensional array.
        To create multidimensional arrays, place each array within its own set of square brackets.
         */
        int[ ][ ] sample = { {1, 2, 3}, {4, 5, 6} };
        int x = sample[1][0];//The array's two indexes are called row index and column index
        System.out.println(x);
    }
    /*
    In Java, you're not limited to just two-dimensional arrays.
    Arrays can be nested within arrays to as many levels as your program needs.
    All you need to declare an array with more than two dimensions, is to add as many sets of empty brackets as you need. However, these are harder to maintain.
    Remember, that all array members must be of the same type.
     */
}
