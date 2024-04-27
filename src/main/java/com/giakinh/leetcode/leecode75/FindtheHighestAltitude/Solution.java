package com.giakinh.leetcode.leecode75.FindtheHighestAltitude;

public class Solution {

    public static int largestAltitude(int[] gain) {
        int sum = 0;
        int i = 0;
        int max = 0;
        while (i < gain.length) {
            sum += gain[i];
            if (sum > max) {
                max = sum;
            }
            i++;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(largestAltitude(new int[]{-5, 1, 5, 0, -7}));
    }
}
