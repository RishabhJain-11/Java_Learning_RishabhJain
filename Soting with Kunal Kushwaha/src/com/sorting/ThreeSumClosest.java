package com.sorting;

import java.util.Arrays;

import static java.lang.Math.abs;

public class ThreeSumClosest {
    public static void main(String[] args) {

        int[] arr = new int[]{-1, 2, 1, -4 };
        int x = 1;

        System.out.println(solution(arr, x));
    }

static int solution(int[] arr, int x)
{
    //EFFICIENT APPROACH

    // Sort the array
    Arrays.sort(arr);

    // To store the closest sum
    // Assigning long to avoid overflow condition
    // when array has negative integers
    long closestSum = Integer.MAX_VALUE;

    // Fix the smallest number among
    // the three integers
    for (int i = 0; i < arr.length - 2; i++)
    {

        // Two pointers initially pointing at
        // the last and the element
        // next to the fixed element
        int ptr1 = i + 1, ptr2 = arr.length - 1;

        // While there could be more pairs to check
        while (ptr1 < ptr2)
        {

            // Calculate the sum of the current triplet
            int sum = arr[i] + arr[ptr1] + arr[ptr2];

            // If the sum is more closer than
            // the current closest sum
            if (abs(x - sum) < abs(x - closestSum))
            {
                closestSum = sum;
            }

            // If sum is greater then x then decrement
            // the second pointer to get a smaller sum
            if (sum > x)
            {
                ptr2--;
            }

            // Else increment the first pointer
            // to get a larger sum
            else
            {
                ptr1++;
            }
        }
    }

    // Return the closest sum found
    return (int)closestSum;
}

}


/*NAIVE APPROACH
    public static int solution(int arr[], int x)
    {

        // To store the closest sum
        int closestSum = Integer.MAX_VALUE;

        // Run three nested loops each loop
        // for each element of triplet
        for(int i = 0; i < arr.length ; i++)
        {
            for(int j = i + 1; j < arr.length; j++)
            {
                for(int k = j + 1; k < arr.length; k++)
                {

                    // Update the closestSum
                    if (Math.abs(x - closestSum) > Math.abs(x - (arr[i] + arr[j] + arr[k])))
                        closestSum = (arr[i] + arr[j] + arr[k]);
                }
            }
        }

        // Return the closest sum found
        return closestSum;




    }*/