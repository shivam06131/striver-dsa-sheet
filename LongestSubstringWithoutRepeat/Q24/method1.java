package LongestSubstringWithoutRepeat.Q24;

import java.util.LinkedHashSet;
import java.util.Set;

//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.

public class method1 {
    public static void main(String[] args) {
        int val = solution("abcaabcdba");
        System.out.println(val);
    }

    public static int solution(String s) {
        Set<Character> set = new LinkedHashSet<>();
        int left = 0;
        int right = 0;
        int length = 0;

        while (right < s.length()) {
            if (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            } else {
                length = Math.max(length, right - left + 1);
                set.add(s.charAt(right));
                right++;
            }
        }
        return length;
    }
}
