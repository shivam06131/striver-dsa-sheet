package LongestSubstringWithoutRepeat.Q24;

import java.util.HashMap;

//solve using hashmap insted of using set

public class method2 {
    public static void main(String[] args) {
        int val = solution("abcaabcdba");
        int val2 = solution("bbbbb");
        int val3 = solution("pwwkew");
        System.out.println(val3);
    }

    public static int solution(String s) {
        int left = 0;
        int right = 0;
        int StringLength = 0;
        HashMap<Character, Integer> hash = new HashMap<>();
        while (right < s.length()) {
            if (hash.containsKey(s.charAt(right))) {
                if (hash.get(s.charAt(right)) < left) {
                    hash.put(s.charAt(right), right);
                    StringLength = Math.max(right - left + 1, StringLength);
                    right++;
                } else {
                    left = hash.get(s.charAt(right)) + 1;
                    hash.put(s.charAt(right) , right);
                    StringLength = Math.max(StringLength , right - left + 1);
                    right++;
                }
            } else {
                hash.put(s.charAt(right), right);
                StringLength = Math.max(right - left + 1, StringLength);
                right++;
            }
        }
    return StringLength;
    }
}
