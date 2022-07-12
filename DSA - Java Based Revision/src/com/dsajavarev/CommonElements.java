package com.dsajavarev;

import java.util.*;
//import java.util.stream.Collectors;

public class CommonElements {
    public static void main(String[] args) {
        int n1 = 6; int[] A = {1, 5, 10, 20, 40, 80};
        int n2 = 5; int[] B = {6, 7, 20, 80, 100};
        int n3 = 8; int[] C = {3, 4, 15, 20, 30, 70, 80, 120};
        System.out.println(commonElements(A,B,C,n1,n2,n3));
    }
    public static ArrayList<Integer> commonElements(int[] A, int[] B, int[] C, int n1, int n2, int n3){
        int i = 0,j = 0,k = 0;
        Set<Integer> ans2 = new HashSet<>();//this ensures that the final ans does not have any repeated element.

        //main logic
        while (i < n1 && j < n2 && k < n3){
            if(A[i] == B[j] && B[j] == C[k]){
                ans2.add(A[i]);
                i++;
                j++;
                k++;
            }
            else if (A[i] < B[j]){
                i++;
            }
            else if (B[j] < C[k]){
                j++;
            }
            else
                k++;
        }

        //adding the elements into the list format.
        ArrayList<Integer> ans = new ArrayList<>(ans2);//making into a list format
        Collections.sort(ans); // sorting the made list
        return ans;
    }
}
