package com.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraysListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //wrapper classes - Integer (oops)
        ArrayList<Integer> list = new ArrayList<>(10) ;
//        list.add(11);
//        list.add(9);
//        list.add(1);
//        list.add(10);
//        list.add(7);
//        list.add(11);
//        list.add(9);
//        list.add(1);
//        list.add(10);
//        list.add(7);

//        list.set(0,99);
//        list.remove(3);
        System.out.println(list);


        //input
        for (int i = 0 ; i < 5 ; i++){
            list.add(in.nextInt());
        }

        for (int i = 0 ; i < 5 ; i++){
            System.out.println(list.get(i));//pass index here
        }
    }
}
