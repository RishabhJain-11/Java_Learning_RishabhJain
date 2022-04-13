package com.dsajavarev;

public class CyclicallyRotate {
    public static void main(String[] args) {
        int N = 5;
        int[] A = {1, 2, 3, 4, 5};
        rotate(A, N);
    }
    public static void rotate(int[] arr, int n)
    {
        int temp = arr[n-1];
        System.arraycopy(arr, 0, arr, 1, n - 1);
        arr[0] = temp;
    }
}
