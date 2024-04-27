package com.giakinh.leetcode.leecode75.MaximumAverageSubarrayI;

public class Solution {

    public static double findMaxAverage(int[] nums, int k) {
        double max = 0;
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        max = sum / k;
        int i = 1;
        while (i + k - 1 < nums.length) {
            sum = sum - nums[i - 1] + nums[i + k - 1];
            double avg = sum / k;
            if (avg > max) {
                max = avg;
            }
            i += 1;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));
        System.out.println(findMaxAverage(new int[]{-1}, 1));
        System.out.println(findMaxAverage(new int[]{0,1,1,3,3}, 4));
    }
}
