package com.javawithrmj.TECHIEDELIGHT;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class EquilibriumIndexOfArray {
    public static void main(String[] args) {
        int[] a = {0,-3,5,-4,-2,3,1,0};
        index2(a);
    }

    static void index(int[] a){
        int[] left = new int[a.length];
        left[0] = 0;

        for (int i = 1; i < a.length; i++) {
            left[i] = left[i-1] + a[i-1];
        }

        int right = 0;

        List<Integer> indices = new ArrayList<>();

        for (int i = a.length - 1; i >= 0; i--) {

            if (left[i] == right){
                indices.add(i);
            }
            right += a[i];
        }
        System.out.println("Equilibrium index found at = "+ indices);
    }


    static void index2(int[] a){
        int total = IntStream.of(a).sum();

        int right = 0;

        List<Integer> indices = new ArrayList<>();
        for (int i = a.length - 1;  i >= 0 ; i--) {
            if (right == total - (a[i] + right)){
                indices.add(i);
            }
            right += a[i];
        }
        System.out.println("Equilibrium Index at = " + indices);
    }
}//The time complexity of the above solution is O(n) and doesn’t require any extra space
