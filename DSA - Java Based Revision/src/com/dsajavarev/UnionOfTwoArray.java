package com.dsajavarev;

import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoArray {
    public static void main(String[] args) {

        int n = 5 ;
        int[] a = {1 ,2 ,3 ,4 ,5};

        int m = 3 ;
        int[] b = {1 ,2 ,3};
        System.out.println(doUnion(a,n,b,m));
    }
    public static int doUnion(int a[], int n, int b[], int m)
    {
        //Your code here
        Set<Integer> union = new HashSet<>();
        for(int e : a){
            union.add(e);
        }
        for(int e : b){
            union.add(e);
        }
        return union.size();
    }
}
