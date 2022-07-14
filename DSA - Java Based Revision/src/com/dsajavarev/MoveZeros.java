package com.dsajavarev;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {1,0,2,3,0,1};
//        System.out.println(moveZeroes(nums));
//        (moveZeroes(nums));
//        System.out.println();
    }

    public static void moveZeroes(int[] nums) {
        //base condn
        if(nums == null || nums.length == 0)
            return;

        //
        int insertPos = 0;
        for(int num : nums){
            if(num != 0)
                nums[insertPos++] = num;
        }
        while(insertPos < nums.length){
            nums[insertPos++] = 0;
        }
    }
}
