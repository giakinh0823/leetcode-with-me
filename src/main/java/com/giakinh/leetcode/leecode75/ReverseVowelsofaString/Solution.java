package com.giakinh.leetcode.leecode75.ReverseVowelsofaString;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public String reverseVowels(String s) {
        Map<Character, Integer> vowel = new HashMap<>();
        vowel.put('u', 1);
        vowel.put('e', 1);
        vowel.put('o', 1);
        vowel.put('a', 1);
        vowel.put('i', 1);
        vowel.put('U', 1);
        vowel.put('E', 1);
        vowel.put('O', 1);
        vowel.put('A', 1);
        vowel.put('I', 1);

        char[] cs = s.toCharArray();
        int len = s.length();

        int i = 0;
        int j = len - 1;

        while (i < j) {
            while (i < j && vowel.get(cs[i]) == null) {
                i++;
            }

            while (i < j && vowel.get(cs[j]) == null) {
                j--;
            }

            if(i<j){
                char t = cs[i];
                cs[i] = cs[j];
                cs[j] = t;
                ++i;
                --j;
            }
        }

        return String.valueOf(cs);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverseVowels("hello"));
        System.out.println(solution.reverseVowels("leetcode"));
        System.out.println(solution.reverseVowels("aA"));
        System.out.println(solution.reverseVowels("a.b,."));
        System.out.println(solution.reverseVowels(".,"));
    }
}
