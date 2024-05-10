package com.giakinh.leetcode.leecode75.twoPointers.ContainerWithMostWater;

public class Solution {

    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int max = 0;
        while (i < j) {
            int minHeight = Math.min(height[i], height[j]);
            if (minHeight * (j - i) > max) {
                max = minHeight * (j - i);
            }
            if (height[i] < height[i + 1]) {
                i++;
            } else if (height[j] < height[j - 1]) {
                j--;
            } else {
                i++;
                j--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        System.out.println(solution.maxArea(new int[]{1, 3, 2, 5, 25, 24, 5}));
    }
}
