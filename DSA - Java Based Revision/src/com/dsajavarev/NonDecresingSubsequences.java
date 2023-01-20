package com.dsajavarev;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NonDecresingSubsequences {
    public static void main(String[] args) {
        int[] nums = {4,6,7,7};
        System.out.println(findSubsequences(nums));
    }
    private static void backtrack(int[] nums, int index, List<Integer> sequence,
                           Set<List<Integer>> result) {
        // if we have checked all elements
        if (index == nums.length) {
            if (sequence.size() >= 2) {
                result.add(new ArrayList<>(sequence));
            }
            return;
        }
        // if the sequence remains increasing after appending nums[index]
        if (sequence.isEmpty() ||
                sequence.get(sequence.size() - 1) <= nums[index]) {
            // append nums[index] to the sequence
            sequence.add(nums[index]);
            // call recursively
            backtrack(nums, index + 1, sequence, result);
            // delete nums[index] from the end of the sequence
            sequence.remove(sequence.size() - 1);
        }
        // call recursively not appending an element
        backtrack(nums, index + 1, sequence, result);
    }

    public static List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> result = new HashSet<List<Integer>>();
        List<Integer> sequence = new ArrayList<Integer>();
        backtrack(nums, 0, sequence, result);
        return new ArrayList(result);
    }
}
