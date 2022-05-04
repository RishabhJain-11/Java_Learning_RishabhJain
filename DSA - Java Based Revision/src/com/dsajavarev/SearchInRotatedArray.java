package com.dsajavarev;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int N = 9;
        int[] A = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int key = 10;
        int l = 0;
        int h = A.length;
        System.out.println(search(A,l,h,key));
    }
    static int binary(int key,int l,int h,int[] A){
        if(l > h)
            return -1;

        int mid = (l + h) / 2;
        if(key == A[mid])
            return mid;
        if(key > A[mid]){
            return binary(key,mid + 1,h,A);
        }
        if(key < A[mid]){
            return binary(key,l,mid - 1,A);
        }
        return -1;
    }
    static int search (int[] A, int l , int h, int key){
        int min_index=0;
        //to find minmum index
        for(int i=0;i<A.length;i++ )
        {
            if(A[i]<A[min_index])
            {
                min_index=i;
            }
        }
        int b1=binary(key,0,min_index,A);
        int b2=binary(key,min_index+1,A.length-1,A);
        // Complete this function
        if(b1==-1)
            return b2;
        else
            return b1;
    }
}
