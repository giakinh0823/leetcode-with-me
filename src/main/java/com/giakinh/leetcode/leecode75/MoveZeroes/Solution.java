package com.giakinh.leetcode.leecode75.MoveZeroes;

public class Solution {

    public void moveZeroes(int[] nums) {
        int numZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                numZero++;
            } else if (numZero > 0) {
                nums[i - numZero] = nums[i];
                nums[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = new int[]{0, 1, 0, 3, 12};
        solution.moveZeroes(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
