package com.giakinh.leetcode.leecode75.array.GreatestCommonDivisorofStrings;

public class Solution2 {
    public String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        int gdcLength = gcd(len1, len2);

        String subStr = str1.substring(0, gdcLength);

        if(str1.equals(repeat(subStr, len1 / gdcLength))){
            if(str2.equals(repeat(subStr, len2 / gdcLength))){
                return subStr;
            }
        }
        return "";
    }

    private static String repeat(String str, int times) {
        return String.valueOf(str).repeat(Math.max(0, times));
    }

    public static int gcd(int a, int b){
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        System.out.println(solution.gcdOfStrings("ABCABC", "ABC"));
        System.out.println(solution.gcdOfStrings("ABABAB", "ABAB"));
        System.out.println(solution.gcdOfStrings("LEET", "CODE"));
        System.out.println(solution.gcdOfStrings("ABCDEF", "ABC"));
        System.out.println(solution.gcdOfStrings("EFGABC", "ABC"));
    }
}
