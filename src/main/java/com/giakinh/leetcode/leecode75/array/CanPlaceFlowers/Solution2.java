package com.giakinh.leetcode.leecode75.array.CanPlaceFlowers;

public class Solution2 {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0;
        while (i < flowerbed.length && n > 0) {
            if(flowerbed[i] == 0){
                n--;
                if (i + 1 < flowerbed.length && flowerbed[i + 1] == 1 || i - 1 > 0 && flowerbed[i - 1] == 1) {
                    n++;
                    i--;
                }
            }
            i += 2;
        }
        return n == 0;
    }

    public static void main(String[] args) {
        Solution2 solution1 = new Solution2();
        System.out.println(solution1.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1));
        System.out.println(solution1.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2));
        System.out.println(solution1.canPlaceFlowers(new int[]{1, 0, 0, 0, 0, 1}, 2));
        System.out.println(solution1.canPlaceFlowers(new int[]{1, 0, 0, 0, 0, 1}, 3));
        System.out.println(solution1.canPlaceFlowers(new int[]{1, 0, 0, 0, 0, 0, 1}, 3));
        System.out.println(solution1.canPlaceFlowers(new int[]{1, 0, 0, 0, 0, 0, 1}, 2));
        System.out.println(solution1.canPlaceFlowers(new int[]{1, 0, 0, 0, 0, 0, 0, 1}, 3));
        System.out.println(solution1.canPlaceFlowers(new int[]{1, 0, 0, 0, 0, 0, 0, 0, 1}, 3));
        System.out.println(solution1.canPlaceFlowers(new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 1}, 3));
        System.out.println(solution1.canPlaceFlowers(new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 3));
        System.out.println(solution1.canPlaceFlowers(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, 3));
        System.out.println(solution1.canPlaceFlowers(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0}, 3));
        System.out.println(solution1.canPlaceFlowers(new int[]{0, 0, 0, 0, 0, 0, 0, 0}, 3));
        System.out.println(solution1.canPlaceFlowers(new int[]{0, 0, 0, 0, 0, 0, 0}, 3));
    }
}
