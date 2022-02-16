package com.javawithrmj.TECHIEDELIGHT;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 10, 10, 1, 4, 2, 1, 10 };
        int k = 10;
        countSort2(arr,k);
        System.out.println(Arrays.toString(arr));
    }

    public static void countSort(int[] arr,int k){
        int[] output = new int[arr.length];
        int[] freq = new int[k+1];

        for (int i:arr){
            freq[i]++;
        }

        int total = 0;
        for (int i = 0; i < k+1; i++) {
            int oldCount = freq[i];
            freq[i] = total;
            total += oldCount;
        }


        for (int i:arr){
            output[freq[i]] = i;
            freq[i]++;
        }

        Arrays.setAll(arr,i->output[i]);
    }



    static void countSort2(int[] arr,int k){
        int[] freq = new int[k+1];
        for (int i:arr){
            freq[i]++;
        }

        int index = 0;

        for (int i = 0; i < k+1; i++) {
            while (freq[i]-- > 0){
                arr[index++] = i;
            }
        }
    }
}
/*
Performance
The time complexity of the counting sort is O(n + k), where n is the size of the input and k is the input range.
Since it uses arrays of length k+1 and n, the total space used by the algorithm is also O(n + k).

Counting sort can be highly space-efficient when the range of keys k is significantly less than the total number of items n,
but when variation in keys is significantly greater than the total number of items k >> n, counting sort consumes a lot of space.
 */