package com.giakinh.leetcode.leecode75.MaxConsecutiveOnesIII;

public class Solution2 {

    public static int longestOnes(int[] nums, int k) {
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(longestOnes(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2));
        System.out.println(
                longestOnes(new int[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1}, 3));
        System.out.println(longestOnes(new int[]{1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0}, 0));
        System.out.println(longestOnes(new int[]{0, 0, 0, 1}, 4));
    }
}
