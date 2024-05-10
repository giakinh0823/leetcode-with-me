package com.giakinh.leetcode.leecode75.twoPointers.MaxNumberofKSumPairs;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int d = 0;
        for (int num : nums) {
            int m = k - num;
            Integer value = map.get(m);
            if (value == null) {
                map.merge(num, 1, Integer::sum);
            } else {
                if (value > 1) {
                    map.put(m, value - 1);
                } else {
                    map.remove(m);
                }
                d += 1;
            }
        }
        return d;
    }

    public static void main(String[] args) {
        System.out.println(maxOperations(new int[]{1, 2, 3, 4}, 5));
    }
}
