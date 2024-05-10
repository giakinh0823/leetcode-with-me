package com.giakinh.leetcode.leecode75.array.IncreasingTripletSubsequence;

public class Solution {

    public boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= a) {
                a = num;
            } else if (num <= b) {
                b = num;
            } else {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.increasingTriplet(new int[]{1, 2, 3, 4, 5}));
        System.out.println(solution.increasingTriplet(new int[]{5, 4, 3, 2, 1}));
        System.out.println(solution.increasingTriplet(new int[]{2, 1, 5, 0, 4, 6}));
    }
}
