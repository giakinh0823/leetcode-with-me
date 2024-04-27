package com.giakinh.leetcode.leecode75.LongestSubarrayof1sAfterDeletingOneElement;

public class Solution {

    public int longestSubarray(int[] nums) {
        int start = 0;
        int end = 0;
        int zeros = 0;
        int ans = 0;
        while (end < nums.length) {
            if (nums[end] == 0) {
                zeros++;
            }
            while (zeros > 1) {
                if (nums[start] == 0) {
                    zeros--;
                }
                start++;
            }
            ans = Math.max(ans, end - start + 1 - zeros);
            end++;
        }
        return (ans == nums.length) ? ans - 1 : ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestSubarray(new int[]{1, 1, 0, 1}));
    }
}
