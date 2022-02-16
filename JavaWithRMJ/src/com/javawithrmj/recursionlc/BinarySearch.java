package com.javawithrmj.recursionlc;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1,0,3,5,9,12};
        int n = a.length;
//        int result = binarysearchiterative(a,x,0,n-1);
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int result = binarysearchiterative(a,x,0,n-1);
        if(result == -1){
            System.out.println("Result Not found");
        }else{
            System.out.println("The index of the target is = " + result);
        }
    }
    public static int binarysearchiterative(int[] a, int target,int s , int e) {
         s = 0;
         e = a.length - 1;
        while (s <= e){
        int mid = s + (e - s) / 2;

            if(a[mid] == target){
                return mid;
            }
            else if (target < a[mid]){
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
        }
        return -1;
    }

    public static int binarysearchrecursive(int[] a, int target,int s , int e) {
         s = 0;
         e = a.length - 1;
        while (s <= e){
        int mid = s + (e - s) / 2;

            if(a[mid] == target){
                return mid;
            }
            else if (target < a[mid]){
                return binarysearchrecursive(a,target,s,mid-1);
            }
            else{
                return binarysearchrecursive(a,target,mid+1,e);
            }
        }
        return -1;
    }
}



