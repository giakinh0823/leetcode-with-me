package com.giakinh.leetcode.leecode75.array.MergeStringsAlternately;

public class Solution {

    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        int j = 0;

        while (i < word1.length() && j < word2.length()){
            result.append(word1.charAt(i));
            result.append(word2.charAt(j));
            i++;
            j++;
        }
        if(i < word1.length()){
            result.append(word1.substring(i));
        }
        if(j < word2.length()){
            result.append(word2.substring(j));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.mergeAlternately("abc", "pqr"));
        System.out.println(solution.mergeAlternately("ab", "pqrs"));
        System.out.println(solution.mergeAlternately("abcd", "pq"));
    }
}
