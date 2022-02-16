package com.recursionarray;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {1,2,4,6,7,8};
        System.out.println(sort(arr,0));
    }
    static boolean sort(int[] arr,int index){
        //base condition
        if(index == arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sort(arr,index +1);
    }
}
