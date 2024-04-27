package com.giakinh.leetcode.leecode75.GreatestCommonDivisorofStrings;

public class Solution1 {

    public String gcdOfStrings(String str1, String str2) {
        if (!str1.contains(str2) && !str2.contains(str1)) {
            return "";
        }

        int i = str1.length() > str2.length() ? str1.indexOf(str2) : str2.indexOf(str1);
        while (i != -1 && !str1.isEmpty() && !str2.isEmpty()) {
            if (str1.length() > str2.length()) {
                str1 = str1.substring(i + str2.length());
            } else if (str1.length() < str2.length()) {
                str2 = str2.substring(i + str1.length());
            } else {
                break;
            }
            i = str1.length() > str2.length() ? str1.indexOf(str2) : str2.indexOf(str1);
        }

        if (!str1.equals(str2)) {
            return "";
        }

        return str1;
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        System.out.println(solution.gcdOfStrings("ABCABC", "ABC"));
        System.out.println(solution.gcdOfStrings("ABABAB", "ABAB"));
        System.out.println(solution.gcdOfStrings("LEET", "CODE"));
        System.out.println(solution.gcdOfStrings("ABCDEF", "ABC"));
        System.out.println(solution.gcdOfStrings("EFGABC", "ABC"));
    }
}
