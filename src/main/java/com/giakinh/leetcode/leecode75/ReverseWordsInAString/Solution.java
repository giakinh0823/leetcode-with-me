package com.giakinh.leetcode.leecode75.ReverseWordsInAString;

public class Solution {

    public String reverseWords(String s) {
        int i = 0;
        StringBuilder reverseWords = new StringBuilder();
        while (i < s.length()) {
            StringBuilder word = new StringBuilder();
            while (i < s.length() && s.charAt(i) != ' ') {
                word.append(s.charAt(i));
                i++;
            }
            if (!word.toString().isEmpty()) {
                if(reverseWords.isEmpty()){
                    reverseWords.insert(0, word);
                } else {
                    reverseWords.insert(0, word + " ");
                }
            }
            i++;
        }
        return reverseWords.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverseWords("the sky is blue"));
        System.out.println(solution.reverseWords("  hello world  "));
        System.out.println(solution.reverseWords("a good   example"));
    }
}
