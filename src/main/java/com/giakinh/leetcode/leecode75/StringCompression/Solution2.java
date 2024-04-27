package com.giakinh.leetcode.leecode75.StringCompression;

public class Solution2 {

    public int compress(char[] chars) {

        if (chars.length == 1)
            return 1;

        char ch = chars[0];
        int counter = 1;
        int endRange = 1;
        for (int j = 1; j < chars.length; j++) {
            if (chars[j] == ch) {
                counter++;
            } else {
                if (counter > 9) {
                    chars[endRange++] = (char) ((counter / 10) + '0');
                    chars[endRange++] = (char) ((counter % 10) + '0');
                } else if (counter > 1) {
                    chars[endRange] = (char) (counter + '0');
                    endRange++;
                }
                ch = chars[j];
                counter = 1;
                chars[endRange] = ch;
                endRange++;
            }
        }

        if (counter > 9) {
            String str = String.valueOf(counter);
            char[] nums = str.toCharArray();
            for (char c : nums) {
                chars[endRange++] = c;
            }
        } else if (counter > 1) {
            chars[endRange] = (char) (counter + '0');
            endRange++;
        }

        return endRange;
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        System.out.println(solution.compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}));
    }
}
