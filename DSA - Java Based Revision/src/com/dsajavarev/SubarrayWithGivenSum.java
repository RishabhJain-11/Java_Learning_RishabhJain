package com.dsajavarev;



//#2nd Approach - Hashing

import java.util.ArrayList;

public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = 5;
        int target = 10;
        System.out.println(subarraySum(arr,n,target));
    }

    /*
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
   {
       // Your code here

       ArrayList<Integer> num = new ArrayList<Integer>();

       int sum = 0, start = 0;
       int i=0;
       while(i<n)
       {
           sum = sum+arr[i];
           //System.out.println(sum);
           while(sum>s&&start<n)
             {
                 sum = sum-arr[start];
                 start++;
             }

             if(sum==s)
             {
                 num.add(start+1);
                 num.add(i+1);
                 return num;
             }
             i++;
       }

       num.add(-1);
       return num;
   }
}
     */
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        // Your code
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int left = 0;
        int right = 0;
        int curr = arr[0];
        int flag = 0;
        while(right < n){
            if(curr < s){
                right++;
                if(right < n){
                    curr += arr[right];
                }
            }
            else if(curr > s){
                curr -= arr[left];
                left++;

                if(left > right){
                    right++;
                    if(right <n){
                        curr = arr[right];
                    }
                }
            }
            else{
                // ans.add(left+1);
                // ans.add(right+1);
                flag = 1;
                break;
            }
        }
        if(flag == 1){
            ans.add(left+1);
            ans.add(right+1);
        }
        else{
            ans.add(-1);
        }
        return ans;
    }
}































//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.IntStream;
/*
public class SubarrayWithGivenSum {
//    private static SubarrayWithGivenSum ArrayUtils;

    public static void main(String[] args) {
        int[] nums = { 3, 4, -7, 1, 3, 3, 1, -4 };
        int target = 7;
        subarray(nums,target);
    }
    public static void subarray(int[] nums,int target){
        int n = nums.length;
        for(int i = 0;i < n;i++){
            int sum_so_far = 0;

            for (int j = i; j < nums.length; j++) {
                sum_so_far += nums[j];

                if(sum_so_far == target){
                    print(nums,i,j);
                }
            }
        }
    }

    public static void print(int[] nums, int i, int j){
        System.out.println((IntStream.range(i,j+1).mapToObj(k ->nums[k]).collect(Collectors.toList())));
//        System.out.println(ArrayUtils.indexOf(IntStream.range(i,j+1).mapToObj(k ->nums[k]).collect(Collectors.toList())));

    }

//    private static String indexOf(List<Integer> collect) {
//        return
//    }
}

*/