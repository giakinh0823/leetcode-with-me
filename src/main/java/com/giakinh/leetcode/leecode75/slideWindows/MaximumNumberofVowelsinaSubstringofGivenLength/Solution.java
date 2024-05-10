package com.giakinh.leetcode.leecode75.slideWindows.MaximumNumberofVowelsinaSubstringofGivenLength;

public class Solution {

    public static int maxVowels(String s, int k) {
        String vowels = "aeiou";
        int i = 0;
        int d = 0;
        int max = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            if (vowels.indexOf(c) != -1) {
                d++;
            }
            if (i - k >= 0 && vowels.indexOf(s.charAt(i - k)) != -1) {
                d--;
            }
            if (d > max) {
                max = d;
            }
            i++;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxVowels("abciiidef", 3));
        System.out.println(maxVowels("aeiou", 2));
        System.out.println(maxVowels("leetcode", 3));
        System.out.println(maxVowels("rhythms", 4));
        System.out.println(maxVowels("tryhard", 4));
        System.out.println(maxVowels("novowels", 1));
    }
}
