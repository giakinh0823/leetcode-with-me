package com.giakinh.leetcode.leecode75.array.ProductofArrayExceptSelf;

public class Solution {

    public int[] productExceptSelf(int[] nums) {
        int multi = 1;
        int countOfZero = 0;
        for (int num : nums) {
            if (num == 0) {
                countOfZero++;
                continue;
            }
            multi = multi * num;
        }

        for (int i = 0; i < nums.length; i++) {
            if (countOfZero > 1) {
                nums[i] = 0;
            } else if (nums[i] != 0 && countOfZero == 1) {
                nums[i] = 0;
            } else if (nums[i] == 0 && countOfZero == 1) {
                nums[i] = multi;
            } else {
                nums[i] = multi / nums[i];
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.productExceptSelf(new int[]{1, 2, 3, 4});
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
