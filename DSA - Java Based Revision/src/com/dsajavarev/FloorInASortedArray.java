package com.dsajavarev;

public class FloorInASortedArray {
    public static void main(String[] args) {
        int N = 7, x = 0;
        long arr[] = {1,2,8,10,11,12,19};
        System.out.println(findFloor(arr,N,x));
    }
    static int findFloor(long[] arr, int n, long x)
    {
        int s = 0,e = n-1;
        while(s <= e){
            int mid = s + (e - s)/2;
            if(arr[mid] == x) return mid;
            else if (arr[mid] > x)
                e = mid - 1;
            else
                s = mid + 1;
        }
        if(s == 0){
            if(x < arr[0])
                return -1;
        }
        return s - 1;
    }
}
