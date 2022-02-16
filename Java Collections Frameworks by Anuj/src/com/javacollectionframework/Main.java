package com.javacollectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        list.add(6);
        System.out.println(list);

        list.add(1,7);
        System.out.println(list);

        List<Integer> newList = new ArrayList<>();
        newList.add(8);
        newList.add(9);
        list.addAll(newList);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        list.remove(Integer.valueOf(5));
        System.out.println(list);

//        list.clear();
//        System.out.println(list);

        list.set(2,1000);
        System.out.println(list);

//        list.contains(7);
        System.out.println(list.contains(6));

        System.out.println("\n\n");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("The next element is = "+list.get(i));
        }


        System.out.println("\n\n");
        for (Integer integer : list) {
            System.out.println("The next element is(for each loop/enhanced for loop) : " + integer);
        }

        System.out.println("\n\n");
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            System.out.println("Iterator "+it.next());
        }
    }
}