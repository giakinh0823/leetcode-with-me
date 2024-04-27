package com.giakinh.leetcode.leecode75.StringCompression;

public class Solution1 {

    public int compress(char[] chars) {
        if (chars.length == 1) {
            return 1;
        }

        StringBuilder s = new StringBuilder();
        s.append(chars[0]);
        int i = 0;
        while (i < chars.length - 1) {
            int d = 1;
            while (i < chars.length - 1 && chars[i] == chars[i + 1]) {
                d++;
                i++;
            }
            if (d > 1) {
                s.append(d);
            }
            if (i < chars.length - 1) {
                s.append(chars[i + 1]);
            }
            i++;
        }

        for (i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }

        return s.length();
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        System.out.println(solution.compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}));
    }
}
