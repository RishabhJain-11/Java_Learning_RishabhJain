package com.javacompany.leetcodeassignment;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {

        int[] ret = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(ret));

    }

    static int majorityElement(int[] nums){
        Map<Integer,Integer> myMap = new HashMap<Integer,Integer>();
        int ret = 0;
        for (int num : nums){
            if (!myMap.containsKey(num))
                myMap.put(num,1);
            else
                myMap.put(num,myMap.get(num)+1);

            if(myMap.get(num) > nums.length/2){
                ret = num;
                break;
            }
        }
        return ret;
    }
}
