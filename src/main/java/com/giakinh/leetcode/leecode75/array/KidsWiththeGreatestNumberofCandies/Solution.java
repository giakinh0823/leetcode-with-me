package com.giakinh.leetcode.leecode75.array.KidsWiththeGreatestNumberofCandies;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int j : candies) {
            if (j > max) {
                max = j;
            }
        }
        ArrayList<Boolean> result = new ArrayList<Boolean>(candies.length);
        for (int candy : candies) {
            if (candy + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3));
        System.out.println(solution.kidsWithCandies(new int[]{4, 2, 1, 1, 2}, 1));
        System.out.println(solution.kidsWithCandies(new int[]{12, 1, 12}, 10));
    }
}
