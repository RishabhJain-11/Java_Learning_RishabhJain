package com.functions;

public class Pythagorean_Triplet {
    static boolean isTriplet(int[] arr , int n){
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n ; j++) {
                for (int k = j+1; k < n ; k++) {
                    int x = arr[i]*arr[i],y = arr[j]*arr[j],z = arr[k]*arr[k];
                    if(x==y+z || y==x+z|| z==y+x)
                        return true;

                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7};
        int arr_size= arr.length;
        if(isTriplet(arr, arr_size)){
            System.out.println("Yes , it is a pythagorean triplet");
        }else {
            System.out.println("It is not a pythagorean triplet");
        }
    }
}
