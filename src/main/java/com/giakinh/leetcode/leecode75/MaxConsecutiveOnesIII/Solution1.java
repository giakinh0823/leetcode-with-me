package com.giakinh.leetcode.leecode75.MaxConsecutiveOnesIII;

public class Solution1 {

    public static int longestOnes(int[] nums, int k) {
        int i = 0;
        int max = 0;
        while (i < nums.length) {
            int l = k;
            int d = 0;
            int j = i;
            while (j < nums.length) {
                if (nums[j] == 0) {
                    if(l == 0){
                        break;
                    }
                    l--;
                }
                d++;
                j++;
            }
            if (d > max) {
                max = d;
            }
            i++;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(longestOnes(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2));
        System.out.println(longestOnes(new int[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1}, 3));
        System.out.println(longestOnes(new int[]{1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0}, 0));
        System.out.println(longestOnes(new int[]{0, 0, 0, 1}, 4));
    }
}
