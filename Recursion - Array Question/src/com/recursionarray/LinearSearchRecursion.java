package com.recursionarray;

import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearchRecursion {
    public static void main(String[] args) {
      int[] arr = {3,2,1,18,9,1};
/*
        System.out.println(linear(arr,2,0));
        System.out.println(linearlast(arr,1,0));
        System.out.println(linear1(arr,18,0));
        System.out.println(linearlast(arr,18, arr.length-1));
        linearLastIndex(arr,1,0);
        System.out.println(list);
*/
//        ArrayList<Integer> ans = linearLastIndex(arr,1,0,new ArrayList<>());
//        System.out.println(ans);//debug it if you want
        System.out.println(linearLastIndex2(arr,1,0));
    }






    static boolean linear(int[] arr,int target,int index){
        if(index == -1)
            return false;
        return arr[index] == target || linear(arr,target,index+1);
    }





      static boolean linearlast(int[] arr,int target,int index){
        if(index == arr.length)
            return false;
        return arr[index] == target || linearlast(arr,target,index-1);
    }




    static int linear1(int[] arr,int target,int index){
        if(index == arr.length)
            return -1;
        if(arr[index] == target){
            return index;
        }else {
            return linear1(arr, target, index + 1);
        }
    }





    static ArrayList<Integer> list  = new ArrayList<>();
    static void linearLastIndex(int[] arr, int target, int index){
        if(index == arr.length)
            return;
        if(arr[index] == target){
            list.add(index);
        }
        linearLastIndex(arr,target,index+1);
    }






    static ArrayList<Integer> linearLastIndex(int[] arr, int target, int index,ArrayList<Integer> list){
        if(index == arr.length)
            return list;
        if(arr[index] == target){
            list.add(index);
        }
       return linearLastIndex(arr,target,index+1,list);
    }





    static ArrayList<Integer> linearLastIndex2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length)
            return list;

        //this will contain answer for that function call only
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansfromBelowCalls = linearLastIndex2(arr,target,index+1);
        list.addAll(ansfromBelowCalls);
        return list;
    }




}
/*'
linkedin acount - sb is just for analysing the possible situations where in if i do a particular deed  people connect people and get all the fame by just posting it .
this experiment will go on till dec31 2021
 */