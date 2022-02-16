package com.practice;

import java.util.Scanner;

public class AverageMarks {
    static double avg_cal(int a[] ){
        double sum =0;
        for(int i =0 ; i<a.length ;i++){
            sum += a[i];

        }
        return sum;
    }


    public static void main(String[] args) {
        int i ;
        System.out.println("enter the number of subjects :");
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int [n];
        System.out.println("Enter marks");

        for( i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }

        double avg=avg_cal(a);

        System.out.print("Average of (");

        for(i=0;i<n-1;i++)
        {
            System.out.print(a[i]+",");
        }
        System.out.println(a[i]+") ="+avg/n);

    }

    }

