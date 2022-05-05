package com.dsajavarev;
//https://practice.geeksforgeeks.org/problems/maximum-no-of-1s-row3027/1/?page=1&difficulty[]=0&difficulty[]=1&status[]=unsolved&company[]=Amazon&company[]=Microsoft&company[]=Flipkart&company[]=Adobe&company[]=Google&company[]=Zoho&company[]=Paytm&company[]=Morgan%20Stanley&company[]=Goldman%20Sachs&company[]=Walmart&company[]=D-E-Shaw&company[]=Ola%20Cabs&company[]=VMWare&company[]=Qualcomm&company[]=Intuit%20&company[]=Directi&company[]=Linkedin&company[]=Salesforce&company[]=Codenation&company[]=PayPal&company[]=Media.net%20&company[]=Nagarro%20&company[]=GE&category[]=Searching&curated[]=1&curated[]=7&sortBy=submissions#
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MinimumNumOfOnesRow {
    public static void main(String[] args) {
        int N = 3, M = 4;
        int[][] Mat = {{0, 1, 1, 1},
                       {0 ,0 ,1, 1},
                       {0 ,0 ,1 ,1}};
        System.out.println(maxOnes(Mat,N,M));
    }
    public static int maxOnes (int[][] Mat, int N, int M)
    {
        // your code here
        int count = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i = 0;i < N;i++){
            for(int j = 0;j < M;j++){
                if(Mat[i][j] == 1){
                    count++;
                }
            }
            hm.put(i,count);
            count = 0;
        }

        return Collections.max(hm.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
